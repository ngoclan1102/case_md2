import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Menu {
    public static void main() throws IOException, ClassNotFoundException {
        WriteAndReadFile.list();
        List<Account> accounts = new ArrayList<>();

        int choice = -1;
        while (choice != 0){

            QLKS();
            int choice1 = Integer.parseInt(Create.scanner.nextLine());

            switch (choice1) {
                case 1:
                   Account account = LogIn.logIn();
                    System.out.println("Đăng nhập thành công !");
                    int c1 = -1;
                    while (c1 != 0) {
                        menu();
                        int choice2 = Integer.parseInt(Create.scanner.nextLine());

                        switch (choice2) {
                            case 1:
                                System.out.println("--------Thông tin tài khoản--------");
                                System.out.println(account);
                                System.out.println("-----------------------------------");
                                break;


                            case 2:
                                int c2 = -1;
                                while (c2 != 0) {
                                    menuRoom();
                                    int choice3 = Integer.parseInt(Create.scanner.nextLine());
                                    switch (choice3) {
                                        case 1 : ManagerRoom.addRoom();
                                        break;
                                        case 2 : ManagerRoom.roomList();
                                            break;
                                        case 3 : {
                                            System.out.println("Nhập giá phòng tiền muốn tìm kiếm ");
                                            System.out.println("-----------------------------------");
                                            int price = Integer.parseInt(Create.scanner.nextLine());
                                            System.out.println("-----------------------------------");
                                            ManagerRoom.searchRoom(price);
                                            System.out.println("-----------------------------------");
                                            break;
                                        }
                                        case 4 : ManagerRoom.checkRoom();
                                            break;
                                        case 5 :
                                            ManagerRoom.insertRoom();
                                            break;
                                        case 6 :
                                            ManagerRoom.deleteRoom();
                                            break;
                                        case 0 : c2 = 0;
                                            break;
                                        default:
                                            System.err.println("CHỌN LẠI !");
                                    }
                                }
                                break;


                            case 3:
                                int c3 = -1;
                                while (c3 != 0) {
                                    menuReceipt();
                                    int choice4 = Integer.parseInt(Create.scanner.nextLine());
                                    switch (choice4) {
                                        case 1 : ManagerReceipt.showReceipt();
                                            break;
                                        case 2 : ManagerReceipt.addReceipt();
                                            break;
                                        case 3 : ManagerReceipt.insertReceipt();
                                            break;
                                        case 4 :
                                            ManagerReceipt.deleteReceipt();
                                            break;
                                        case 0 : c3 = 0;
                                            break;
                                        default:
                                            System.err.println("CHỌN LẠI !");
                                    }
                                }
                                break;


                            case 4:
                                TotalMoney.totalMoney();
                                break;


                            case 0:
                                c1 = 0;
                                break;
                            default:
                                System.err.println("CHỌN LẠI !");

                        }
                    }
                    break;
                case 2:
                    Register.register(accounts);
                    System.out.println("Đăng ký thành công!");
                    break;
                case 0 :
                    choice = 0;
                    break;
                default:
                    System.err.println("CHỌN LẠI !");
            }
        }
    }

    public static void QLKS() {
        System.out.println("-------QUẢN LÝ KHÁCH SẠN--------");
        System.out.println("1. Đăng nhập");
        System.out.println("2. Đăng ký");
        System.out.println("0. Thoát");
        System.out.println("Nhập lựa chọn");
    }

    public static void menu() {
        System.out.println("-------------------------------");
        System.out.println("----------MENU---------");
        System.out.println("1. Xem thông tin");
        System.out.println("2. Quản lý phòng");
        System.out.println("3. Quản lý hóa đơn");
        System.out.println("4. Thống kê doanh thu");
        System.out.println("0. Thoát");
        System.out.println("Nhập lựa chọn");
    }

    public static void menuRoom() {
        System.out.println("-------------------------------");
        System.out.println("--------QUẢN LÝ PHÒNG-------");
        System.out.println("1. Thêm phòng");
        System.out.println("2. Danh sách phòng");
        System.out.println("3. Tìm kiếm phòng");
        System.out.println("4. Kiểm tra phòng");
        System.out.println("5. Sửa thông tin phòng");
        System.out.println("6. Xóa phòng");
        System.out.println("0. Thoát");
        System.out.println("Nhập lựa chọn");
    }

    public static void menuReceipt() {
        System.out.println("-------------------------------");
        System.out.println("---------QUẢN LÝ HÓA ĐƠN-------");
        System.out.println("1. Danh sách hóa dơn");
        System.out.println("2. Tạo hóa đơn");
        System.out.println("3. Sửa hóa đơn");
        System.out.println("4. Xóa hóa đơn");
        System.out.println("0. Thoát ");
        System.out.println("Nhập lựa chọn");
    }
}
