import java.io.IOException;
import java.util.List;

public class Register {
    public static void register(List<Account> accounts) throws IOException{
        accounts.add(Create.createRegister());
        WriteAndReadFile.writeFileAccount(accounts);
    }
}
