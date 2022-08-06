import java.util.Scanner;

public class pr_2_4 {
    public static void main(String[] args) {

        //crete object of account class / file
        account account = new account(111, 200,"04-11-2003");
        System.out.println("simple account");
        System.out.println(account);
        System.out.println("--------------------------------------------------------------------------------------");
        
        //crete object of checkingaccount class / file
        CheckingAccount checkingAccount = new CheckingAccount(112, 250,"05-11-2003");
        System.out.println("Checking account");
        System.out.println(account);

        //call withdraw method for withdrawing money
        System.out.println("Enter ammount for withdrawing in checking account  :");
        Scanner s = new Scanner(System.in);
        double ammount = s.nextDouble();
        checkingAccount.withdraw(ammount);
        System.out.println(checkingAccount);

        //crete object of saving account class / file
        SavingAccount savingsAccount = new SavingAccount(113, 10000,"04-11-2003");
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("Saving account");
        System.out.println(account);

        //call withdraw method for withdrawing money
        System.out.println("Enter ammount for withdrawing in saving account  :");
        double ammounts = s.nextDouble();
        savingsAccount.withdraw(ammounts);
        System.out.println(savingsAccount);
    }
}