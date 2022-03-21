
import java.io.IOException;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import java.util.Scanner;


public class Create {
    static Scanner scanner = new Scanner(System.in);

    public static String idReceipt() throws IOException, ClassNotFoundException {
        List<Receipt> receiptList = WriteAndReadFile.readFileReceipt();
        String id;
        int i = 1;
        do {
            System.out.println("Nhập id hóa đơn (3 chữ số)");
            id = Validate.validateIdReceipt();
            for (Receipt r : receiptList) {
                if (id.equals(r.getId())) {
                    i = -1;
                    System.err.println("id " + id + " đã tồn tại");
                    break;
                } else i = 0;
            }
        }while (i != 0);
        return id;
    }

    public static Receipt createReceipt() throws IOException, ClassNotFoundException {
        String id = idReceipt();

        String nameRoom = Validate.validateNameRoom();

        String nameRoomer = Validate.validateNameRoomer();

        String nameTenants = Validate.validateNameTenants();

        System.out.println("Chọn thời gian bắt đầu ");
        System.out.println(" -------------------------------- ");
        LocalDate startTime = createDate();

        System.out.println("Chọn thời gian kết thúc ");
        System.out.println(" -------------------------------- ");
        LocalDate endTime = createDate();

        System.out.println("Nhập tổng tiền");
        int price = Integer.parseInt(scanner.nextLine());

        return new Receipt(id,nameRoom,nameRoomer,nameTenants,startTime,endTime,price);
    }

    public static Account createRegister() {
        String account = Validate.validateAccount();

        String password = Validate.validatePassword();

        String phoneNumber = Validate.validatePhoneNumber();

        String address = Validate.validateAddress();

        String email = Validate.validateEmail();

        String name = Validate.validateName();

        String age = Validate.validateAge();

        return new Account(account,password,phoneNumber,address,email,name,age);
    }

    public static Account createLogIn() {
        String account = Validate.validateAccount();
        String password = Validate.validatePassword();
        return new Account(account,password);
    }

    public static String idRoom() throws IOException, ClassNotFoundException {
        List<Room> rooms = WriteAndReadFile.readFileRoom();
        String id;
        int i = 1;
        do {
            System.out.println("Nhập id phòng");
            id = Validate.validateIdRoom();
            for (Room r : rooms) {
                if (id.equals(r.getId())) {
                    i = -1;
                    System.err.println("id " + id + " đã tồn tại");
                    break;
                } else i = 0;
            }
        }while (i != 0);
        return id;
    }
    public static Room createRoom() throws IOException, ClassNotFoundException {

        String id = idRoom();

        String nameRoom = Validate.validateNameRoom();

        String numberOfRestrooms = Validate.validateNumberOfRestrooms();

       String numberOfBedrooms = Validate.validateNumberOfBedrooms();

        System.out.println("* Nhập trạng thái phòng *");
        System.out.println("1. đang cho thuê");
        System.out.println("2. đang trống");
        System.out.println("3. đang sửa");
        System.out.println("Nhập lựa chọn :");
        int choice = Integer.parseInt(scanner.nextLine());
        String status;
        switch (choice) {
            case 1 :
                status = "Đang cho thuê";
                break;
            case 2 :
                status = "Đang trống";
                break;
            case 3 :
                status = "Đang sửa";
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + choice);
        }

        System.out.println("Nhập giá phòng");
        int priceRoom = Integer.parseInt(scanner.nextLine());

        return new Room(id,nameRoom,numberOfRestrooms,numberOfBedrooms,status,priceRoom);
    }

    public static String month(){
        int i = 1;
        String month = null;
        while (i != 0){
            System.out.println("------------------");
        System.out.println("Chọn tháng");
        System.out.println("---------------------------------");
        System.out.println("* 1. Tháng 1        7. Tháng 7");
        System.out.println("* 2. Tháng 2        8. Tháng 8");
        System.out.println("* 3. Tháng 3        9. Tháng 9");
        System.out.println("* 4. Tháng 4        10. Tháng 10");
        System.out.println("* 5. Tháng 5        11. Tháng 11");
        System.out.println("* 6. Tháng 6        12. Tháng 12");
        System.out.println("---------------------------------");
        System.out.println("Nhập lựa chọn :");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice){
            case 1 :
                i = 0;
                month = "JANUARY";
                break;
            case 2 :
                i = 0;
                month = "FEBRUARY";
                break;
            case 3 :
                i = 0;
                month = "MARCH";
                break;
            case 4 :
                i = 0;
                month = "APRIL";
                break;
            case 5 :
                i = 0;
                month = "MAY";
                break;
            case 6 :
                i = 0;
                month = "JUNE";
                break;
            case 7 :
                i = 0;
                month = "JULY";
                break;
            case 8 :
                i = 0;
                month = "AUGUST";
                break;
            case 9 :
                i = 0;
                month = "SEPTEMBER";
                break;
            case 10 :
                i = 0;
                month = "OCTOBER";
                break;
            case 11 :
                i = 0;
                month = "NOVEMBER";
                break;
            case 12 :
                i = 0;
                month = "DECEMBER";
                break;
            default:
                i = 1;
                System.err.println("Chọn lại !");
        }}
        return month;
    }

    public static int year() {
        int i = 1;
        int year = 0;
        while (i != 0){
            System.out.println("------------------");
        System.out.println("Nhập năm");
         year = Integer.parseInt(scanner.nextLine());
        if (year > 2021){
            i = 1;
            System.err.println("NHẬP LẠI !");
        } else{
            i = 0;
            }
    }
        return year;
    }

    public static LocalDate createDate() {
        int year = year();
        String month = month();
        System.out.println("Nhập ngày");
        int day = Integer.parseInt(scanner.nextLine());
        return LocalDate.of(year, Month.valueOf(month),day);
    }

}
