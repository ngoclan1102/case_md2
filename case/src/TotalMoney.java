import java.io.IOException;
import java.time.Month;
import java.util.List;

public class TotalMoney {
    public static void totalMoney() throws IOException, ClassNotFoundException {
        List<Receipt> receiptList = WriteAndReadFile.readFileReceipt();
        int total = 0;
        String month = Create.month();
        for (Receipt receipt : receiptList) {
            if (Month.valueOf(month).equals(receipt.getStartTime().getMonth())) {
                total += receipt.getPrice();
            }
        }
        System.out.println("Tổng tiền thu nhập là " + total);
    }
}
