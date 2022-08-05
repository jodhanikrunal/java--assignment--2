import java.util.*;

public class pr_2_2 {
    public static void main(String[] args) {
        System.out.println("An example for you to to create a proper account :");
        account d2_1 =new account();
        d2_1.Accessor();
        Scanner s = new Scanner(System.in);
        
        int id;
        double balance,withdraw,deposit,monintrate,monint;
        String date;
        System.out.println("Enter the Account number of your account  :");
        id = s.nextInt();
        System.out.println("Enter the initial balance your account  :");
        balance = s.nextDouble();
        System.out.println("Enter the date at which you created your account  :");
        date = s.next();
        
        account obj = new account(id, balance, date);
        obj.Accessor();
        monintrate = obj.getMonthlyInterestRate();
        monint = obj.getMonthlyInterest();
        System.out.println("Bank give "+monintrate+"% monthly intrest rate.");
        System.out.println("Your monthly intrest is "+monint+" Rupees");
        int i;

        System.out.println("Enter 1 to withdraw and 2 to deposit.");
        i = s.nextInt();
        switch(i)
        {
            case 1 :
            {
                System.out.println("Enter amount to be withdrawn  :");
                withdraw = s.nextDouble();
                obj.withdraw(withdraw);
                System.out.println("The amount remained in your account after withdrawal is   :"+d2_2.balance);
                break;
            }
            case 2 :
            {
                System.out.println("Enter amount to be deposited  :");
                deposit = s.nextDouble();
                balance = obj.deposit(deposit);
                System.out.println("The amount remained in your account after deposit is   :"+balance);
                break;
            }
            default :
            {
                System.out.println("You have changed anything  :");
                break;
            }
        }
        System.out.println("Your account afer withdrawal or deposit  :");
        obj.Accessor();

        int p=1;
        while(p==1)
        {
            System.out.println("Enter 1 use another account and 2 to not.");
            i = s.nextInt();
            if(i==1)
            {
                System.out.println("Enter the Account number of your account  :");
                id = s.nextInt();
                System.out.println("Enter the initial balance your account  :");
                balance = s.nextDouble();
                System.out.println("Enter the date at which you created your account  :");
                date = s.next();

                obj.mutator(id, balance, date);
                obj.Accessor();
                monintrate = obj.getMonthlyInterestRate();
                monint = obj.getMonthlyInterest();
                System.out.println("Bank give "+monintrate+"% monthly intrest rate.");
                System.out.println("Your monthly intrest is "+monint+" Rupees");
                System.out.println("Enter 1 to withdraw and 2 to deposit.");
                i = s.nextInt();
                
                switch(i)
                {
                    case 1 :
                    {
                        System.out.println("Enter amount to be withdrawn  :");
                        withdraw = s.nextDouble();
                        obj.withdraw(withdraw);
                        System.out.println("The amount remained in your account after withdrawal is   :"+d2_2.balance);
                        break;
                    }
                    case 2 :
                    {
                        System.out.println("Enter amount to be deposited  :");
                        deposit = s.nextDouble();
                        balance = obj.deposit(deposit);
                        System.out.println("The amount remained in your account after deposit is   :"+balance);
                        break;
                    }
                    default :
                    {
                        System.out.println("You have changed anything  :");
                        break;
                    }
                }
            }
            else 
            {
                System.out.println("--------------thanks for coming---------------------");
                break;
            }
        }
    }
}
