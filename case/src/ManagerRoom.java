
import java.io.IOException;
import java.time.LocalDate;
import java.util.List;


public class ManagerRoom {
    static List<Room> roomList;

    static {
        try {
            roomList = WriteAndReadFile.readFileRoom();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void insertRoom() throws IOException{
        System.out.println("Nhập id phòng cần sửa (3 chữ số)");
        String id = Validate.validateIdRoom();
        boolean check = false;

        for (int i = 0; i < roomList.size(); i++) {
            if (id.equals(roomList.get(i).getId())){

                String nameRoom = Validate.validateNameRoom();

                String numberOfRestrooms = Validate.validateNumberOfRestrooms();

                String numberOfBedrooms = Validate.validateNumberOfBedrooms();

                System.out.println("Nhập trạng thái phòng");
                System.out.println("1. đang cho thuê");
                System.out.println("2. đang trống");
                System.out.println("3. đang sửa");
                System.out.println("Nhập lựa chọn :");
                int choice = Integer.parseInt(Create.scanner.nextLine());
                String status;
                switch (choice) {
                    case 1 :
                        status = "đang cho thuê";
                        break;
                    case 2 :
                        status = "đang trống";
                        break;
                    case 3 :
                        status = "đang sửa";
                        break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + choice);
                }

                System.out.println("Nhập giá phòng");
                int priceRoom = Integer.parseInt(Create.scanner.nextLine());
                Room room = new Room(id,nameRoom,numberOfRestrooms,numberOfBedrooms,status,priceRoom);
                roomList.set(i,room);
                System.out.println("Sửa thành công");
                check = true;
                break;
            }else check = false;
        }
        if (!check){
            System.err.println("id " + id + " Không tồn tại");
        }
        WriteAndReadFile.writeFileRoom(roomList);
    }

    public static void addRoom() throws IOException, ClassNotFoundException {
        roomList.add(Create.createRoom());
        System.out.println("Thêm thành công");
        WriteAndReadFile.writeFileRoom(roomList);
    }
    public static void deleteRoom() throws IOException {
        boolean check = false;
        System.out.println("Nhập id phòng muốn xóa");
        String idRoom = Validate.validateIdRoom();
        for (int i = 0; i <= roomList.size(); i++) {
            if (idRoom.equals(roomList.get(i).getId())){
                roomList.remove(i);
                System.out.println("Xóa thành công");
                check = true;
                break;
            }else check = false;
        }
        if (!check){
            System.err.println("id " + idRoom + " Không tồn tại");
        }
        WriteAndReadFile.writeFileRoom(roomList);
    }

    public static void roomList(){
        for (Room r: roomList) {
            System.out.println(r);
        }
    }

    public static void searchRoom(int price){
        boolean check = false;
        for (Room r: roomList) {
            if (price + 1000000 >= r.getPrice() && r.getPrice() >= price - 1000000){
                check = true;
                System.out.println(r);
            }
        }
        if (!check){
            System.err.println("Không có phòng nào có giá " + price);
        }
    }

    public static void checkRoom() throws IOException, ClassNotFoundException {
        List<Receipt> receipts = WriteAndReadFile.readFileReceipt();
        List<Room> roomList = WriteAndReadFile.readFileRoom();
        LocalDate localDate = Create.createDate();
        String nameRoom = Validate.validateNameRoom();
        boolean check = true;
        int i = 0;
        while (i < roomList.size()){
            if (nameRoom.equals(roomList.get(i).getNameRoom())) {
                for (Receipt receipt : receipts) {
                    if (localDate.isEqual(receipt.getStartTime()) || localDate.equals(receipt.getEndTime())) {
                        i = roomList.size();
                        System.out.println("đang cho thuê");
                        check = true;
                        break;
                    } else if (localDate.isAfter(receipt.getStartTime()) && localDate.isBefore(receipt.getEndTime())) {
                        i = roomList.size();
                        System.out.println("đang cho thuê");
                        check = true;
                        break;
                    } else {
                        System.out.println(roomList.get(i).getStatus());
                        i = roomList.size();
                        check = true;
                    break;
                    }
                }
            }else{
                i++;
                check = false;}
        }
        if (!check){
            System.out.println("Phòng này không tồn tại");
        }
    }


}
