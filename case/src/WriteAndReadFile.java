import java.io.*;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
public class WriteAndReadFile {

    public static void writeFileReceipt(List<Receipt> receipts) throws IOException {
        FileOutputStream outputStream = new FileOutputStream("receipt.txt");
        ObjectOutputStream outputStream1 = new ObjectOutputStream(outputStream);
        outputStream1.writeObject(receipts);
        outputStream1.close();
        outputStream.close();
    }

    public static List<Receipt> readFileReceipt() throws IOException, ClassNotFoundException {
        FileInputStream inputStream = new FileInputStream("receipt.txt");
        ObjectInputStream inputStream1 = new ObjectInputStream(inputStream);
        List<Receipt> receiptList = (List<Receipt>) inputStream1.readObject();
        inputStream1.close();
        inputStream.close();
        return receiptList;
    }

    public static void writeFileRoom(List<Room> rooms) throws IOException {
        FileOutputStream outputStream = new FileOutputStream("room.txt");
        ObjectOutputStream outputStream1 = new ObjectOutputStream(outputStream);
        outputStream1.writeObject(rooms);
        outputStream1.close();
        outputStream.close();
    }

    public static List<Room> readFileRoom() throws IOException, ClassNotFoundException {
        FileInputStream inputStream = new FileInputStream("room.txt");
        ObjectInputStream inputStream1 = new ObjectInputStream(inputStream);
        List<Room> rooms = (List<Room>) inputStream1.readObject();
        inputStream1.close();
        inputStream.close();
        return rooms;
    }

    public static void writeFileAccount(List<Account> accounts) throws IOException {
        FileOutputStream outputStream = new FileOutputStream("account.txt");
        ObjectOutputStream outputStream1 = new ObjectOutputStream(outputStream);
        outputStream1.writeObject(accounts);
        outputStream1.close();
        outputStream.close();
    }

    public static List<Account> readFileAccount() throws IOException, ClassNotFoundException {
        FileInputStream inputStream = new FileInputStream("account.txt");
        ObjectInputStream inputStream1 = new ObjectInputStream(inputStream);
        List<Account> accounts = (List<Account>) inputStream1.readObject();
        inputStream1.close();
        inputStream.close();
        return accounts;
    }

    public static void list() throws IOException {
        List<Receipt> receipts = new ArrayList<>();
        receipts.add(new Receipt("123","hoa hồng","Lan","Lan", LocalDate.of(2021, Month.FEBRUARY, 1),LocalDate.of(2021,Month.MARCH, 1),5000000));
        receipts.add(new Receipt("234","hoa mai","Lan","Lan", LocalDate.of(2021, Month.FEBRUARY, 1),LocalDate.of(2021,Month.MARCH, 1),6000000));
        receipts.add(new Receipt("345","hoa trà","Lan","Lan", LocalDate.of(2021, Month.FEBRUARY, 1),LocalDate.of(2021,Month.MARCH, 1),8000000));
        WriteAndReadFile.writeFileReceipt(receipts);
        List<Room> rooms = new ArrayList<>();
        rooms.add(new Room("123","hoa hồng","02","03","đang cho thuê",5000000));
        rooms.add(new Room("234","hoa mai","03","03","đang trống",6000000));
        rooms.add(new Room("345","hoa trà","04","05","đang sửa",8000000));
        WriteAndReadFile.writeFileRoom(rooms);
    }
}
