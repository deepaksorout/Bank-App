public interface BankInterface {
    double checkBalance();
    String add(int amount);
    String withdraw(int amount,String Password);
    double interest(int years);
}
