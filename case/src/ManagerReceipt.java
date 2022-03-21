import java.io.*;
import java.time.LocalDate;
import java.util.List;

public class ManagerReceipt {
static List<Receipt> receipts;

    static {
        try {
            receipts = WriteAndReadFile.readFileReceipt();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void showReceipt(){
        for (Receipt r: receipts) {
            System.out.println(r);
        }
    }

    public static void addReceipt() throws IOException, ClassNotFoundException {
        receipts = WriteAndReadFile.readFileReceipt();
        receipts.add(Create.createReceipt());
        System.out.println("Thêm thành công");
        WriteAndReadFile.writeFileReceipt(receipts);
    }

    public static void deleteReceipt() throws IOException {
        boolean check = false;
        System.out.println("Nhập id muốn xóa");
        String idReceipt = Validate.validateIdReceipt();
        for (int i = 0; i < receipts.size(); i++) {
            if (idReceipt.equals(receipts.get(i).getId())){
                receipts.remove(i);
                System.out.println("Xóa thành công");
                check = true;
                break;
            }else check = false;
        }
        if (!check){
            System.err.println("id " + idReceipt + " Không tồn tại");
        }
        WriteAndReadFile.writeFileReceipt(receipts);
    }

    public static void insertReceipt() throws IOException {
        System.out.println("Nhập id hóa đơn cần sửa (3 chữ số)");
        String id = Validate.validateIdReceipt();
        boolean check = false;

        System.out.println("----------------------");
        for (int i = 0; i < receipts.size(); i++) {
            if (id.equals(receipts.get(i).getId())){
                String nameRoom = Validate.validateNameRoom();

                String nameRoomer = Validate.validateNameRoomer();

                String nameTenants = Validate.validateNameTenants();

                System.out.println("Chọn thời gian bắt đầu ");
                System.out.println(" -------------------------------- ");
                LocalDate startTime = Create.createDate();

                System.out.println("Chọn thời gian kết thúc ");
                System.out.println(" -------------------------------- ");
                LocalDate endTime = Create.createDate();

                System.out.println("Nhập tổng tiền");
                int price = Integer.parseInt(Create.scanner.nextLine());
                Receipt receipt = new Receipt(id,nameRoom,nameRoomer,nameTenants,startTime,endTime,price);
                receipts.set(i,receipt);
                System.out.println("Sửa thành công");
                check = true;
                break;
            }
        }
        if (!check){
            System.err.println("id " + id + " Không tồn tại");
        }
        WriteAndReadFile.writeFileReceipt(receipts);
    }


}
