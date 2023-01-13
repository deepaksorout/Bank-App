import java.util.Objects;
import java.util.UUID;

public class SbiUser implements BankInterface{
    private String name;
    private String accountNumber;
    private String password;
    private double balance;
    private double rateofinterest;

    public SbiUser(String name, String password, double balance) {
        this.name = name;
        this.password = password;
        this.balance = balance;

        // bank is initializing

        this.rateofinterest=6;
        this.accountNumber=String.valueOf(UUID.randomUUID());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getRateofinterest() {
        return rateofinterest;
    }

    public void setRateofinterest(double rateofinterest) {
        this.rateofinterest = rateofinterest;
    }

    @Override
    public double checkBalance() {
        return balance;
    }

    @Override
    public String add(int amount) {
        balance=balance+amount;
        return "andha paisa : "+balance;
    }

    @Override
    public String withdraw(int amount, String enteredPassword) {
        if(Objects.equals(enteredPassword,password)){
            if(amount>balance){
                return "kya be bhikari itne paise h tere pass  ";
            }
            else{
                balance-=amount;
                return " "+amount+" paisa nikl gya be ab tu bhi nikal  ";
            }
        }
        else{
            return " password galat h ";
        }
    }

    @Override
    public double interest(int years) {
        return (balance*years*rateofinterest)/100;
    }
}
