import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        // new user
        System.out.println("Enter name, password, balance :  ");
        String name= sc.next();
        String password=sc.next();
        double balance= sc.nextDouble();

        SbiUser user=new SbiUser(name,password,balance);

        // check balance
        System.out.println(user.checkBalance());

        //add money
        System.out.println("enter amount you wanna add : ");
        int money=sc.nextInt();
        System.out.println(user.add(money));

        //withdraw
        System.out.println("Enter amount you wanna withdraw : ");
        int money1=sc.nextInt();
        System.out.println("Enter password : ");
        String pass= sc.next();
        System.out.println(user.withdraw(money1,pass));

        //interest rate
        System.out.println("enter how many years of interest you wanna know : ");
        int years= sc.nextInt();
        System.out.println("Amount after "+years+ "of interesr is : ");
        System.out.println(user.interest(years));

        System.out.println("this is a change");
    }
}