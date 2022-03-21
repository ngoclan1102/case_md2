import java.io.IOException;
import java.util.List;

public class LogIn {
    static List<Account> accountList;

    static {
        try {
            accountList = WriteAndReadFile.readFileAccount();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Account logIn(){
        int k = 0;
        int j = 1;
        boolean check = false;
        while (j != 0) {
            Account account = Create.createLogIn();
            for (int i = 0; i < accountList.size(); i++) {
            if (account.getAccount().equals(accountList.get(i).getAccount()) &&
                    account.getPassword().equals(accountList.get(i).getPassword())) {
                 check = true;
                k = i;
                i = accountList.size();
                j = 0;
                     }else
            {j = 1;
            check = false;
            }
            }if (!check){
                System.err.println("Đăng nhập sai mật khẩu or tài khoản !");
            }
        }
        return accountList.get(k);
    }


}
