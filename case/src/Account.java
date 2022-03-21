import java.io.Serializable;

public class Account implements Serializable {
    private String account;
    private String password;
    private String phoneNumber;
    private String address;
    private String email;
    private String name;
    private String age;

    public Account (String account, String password){
        this.account = account;
        this.password = password;
    }

    public Account(String account, String password, String phoneNumber, String address, String email, String name, String age) {
        this.account = account;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.email = email;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return
                "***  account = " + account + '\n' +
                "***  phoneNumber = " + phoneNumber + '\n' +
                "***  name = " + name + '\n' +
                "***  age = " + age ;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
