import java.util.Scanner;

public class Validate {
    static Scanner scanner = new Scanner(System.in);
    static boolean check;
    public static String validateAccount() {
        do {
            String accountPattern = "^.{8,16}$";
            System.out.println("Nhập tên tài khoản (8-16 ký tự)");
            String account = scanner.nextLine();
            check = account.matches(accountPattern);
            if (!check){
                System.err.println("Sai dữ liệu !");
            }else {
                return account;
            }
        }while (!check);
        return null;
    }

    public static String validatePassword() {
        do {
            String passwordPattern = "^.{8,16}$";
            System.out.println("Nhập mật khẩu (8-16 ký tự)");
            String password = scanner.nextLine();
            check = password.matches(passwordPattern);
            if (!check){
                System.err.println("Sai dữ liệu!");
            }else {
                return password;
            }
        }while (true);
    }

    public static String validatePhoneNumber() {
        do {
            String passwordPattern = "^[0-9]{10}$";
            System.out.println("Nhập số điện thoại (10 số)");
            String phoneNumber = scanner.nextLine();
            check = phoneNumber.matches(passwordPattern);
            if (!check){
                System.err.println("Sai dữ liệu");
            }else {
                return phoneNumber;
            }
        }while (true);
    }

    public static String validateAddress() {
        do {
            String addressPattern = "^.+$";
            System.out.println("Nhập địa chỉ ");
            String address = scanner.nextLine();
            check = address.matches(addressPattern);
            if (!check){
                System.err.println("Sai dữ liệu");
            }else {
                return address;
            }
        }while (true);
    }

    public static String validateEmail() {
        do {
            String emailPattern = "^[a-z]+@gmail\\.com$";
            System.out.println("Nhập email ( abc@gmail.com )");
            String email = scanner.nextLine();
            check = email.matches(emailPattern);
            if (!check){
                System.err.println("Sai dữ liệu");
            }else {
                return email;
            }
        }while (true);
    }

    public static String validateName() {
        do {
            String namePattern = "^.+$";
            System.out.println("Nhập tên ");
            String name = scanner.nextLine();
            check = name.matches(namePattern);
            if (!check){
                System.err.println("Sai dữ liệu");
            }else {
                return name;
            }
        }while (true);
    }

    static boolean check1;
    static boolean check2;

    public static String validateAge() {
        do {
            String agePattern = "^[0-9]{2}$";
            String checkAge1 = "^0[0-9]$";
            String checkAge2 = "^1[0-8]$";
            System.out.println("Nhập tuổi (2 chữ số và trên 18 tuổi)");
            String age = scanner.nextLine();
            check = age.matches(agePattern);
            check1 = age.matches(checkAge1);
            check2 = age.matches(checkAge2);
            if (check1 || check2){
                System.err.println("Chưa đủ tuổi");
            }
            if (check && !check1 && !check2){
                return age;
            }if (!check){
                System.err.println("Sai dữ liệu !");
            }
        }while (!check || check1 || check2 );
        return null;
    }

    public static String validateIdRoom() {
        do {
            String idRoomPattern = "^[0-9]{3}$";
            String idRoom = scanner.nextLine();
            check = idRoom.matches(idRoomPattern);
            if (!check){
                System.err.println("Sai dữ liệu");
                System.out.println("-------------");
                System.out.println("Nhập lại id (3 chữ số)");
            }else {
                return idRoom;
            }
        }while (true);
    }

 public static String validateNameRoom() {
        do {
            String nameRoomPattern = "^.+$";
            System.out.println("Nhập tên phòng");
            String nameRoom = scanner.nextLine();
            check = nameRoom.matches(nameRoomPattern);
            if (!check){
                System.err.println("Sai dữ liệu");
            }else {
                return nameRoom;
            }
        }while (true);
    }

    public static String validateNameRoomer() {
        do {
            String namePattern = "^.+$";
            System.out.println("Nhập tên người cho thuê");
            String name = scanner.nextLine();
            check = name.matches(namePattern);
            if (!check){
                System.err.println("Sai dữ liệu");
            }else {
                return name;
            }
        }while (true);
    }

    public static String validateNameTenants() {
        do {
            String namePattern = "^.+$";
            System.out.println("Nhập tên người thuê");
            String name = scanner.nextLine();
            check = name.matches(namePattern);
            if (!check){
                System.err.println("Sai dữ liệu");
            }else {
                return name;
            }
        }while (true);
    }

 public static String validateNumberOfRestrooms() {
        do {
            String numberOfRestroomsPattern = "^[0-9]{2}$";
            System.out.println("Nhập số phòng vệ sinh (2 chữ số)");
            String numberOfRestrooms = scanner.nextLine();
            check = numberOfRestrooms.matches(numberOfRestroomsPattern);
            if (!check){
                System.err.println("Sai dữ liệu");
            }else {
                return numberOfRestrooms;
            }
        }while (true);
    }

 public static String validateNumberOfBedrooms() {
        do {
            String numberOfBedroomsPattern = "^[0-9]{2}$";
            System.out.println("Nhập số phòng ngủ (2 chữ số)");
            String numberOfBedrooms = scanner.nextLine();
            check = numberOfBedrooms.matches(numberOfBedroomsPattern);
            if (!check){
                System.err.println("Sai dữ liệu");
            }else {
                return numberOfBedrooms;
            }
        }while (true);
    }

    public static String validateIdReceipt() {
        do {
            String idReceiptPattern = "^[0-9]{3}$";
            String idReceipt = scanner.nextLine();
            check = idReceipt.matches(idReceiptPattern);
            if (!check){
                System.err.println("Sai dữ liệu");
            }else {
                return idReceipt;
            }
        }while (true);
    }


}
