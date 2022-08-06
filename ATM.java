public class ATM {
    private static int count;
    private final String id;
    private double balance;

    //method which returns ID
    public String getId() {
        return id;
    }

    //method which returns balance
    public double getBalance() {
        return balance;
    }

    //default constructor
    public ATM() {
        count++;
        if (count < 10) {
            id = "AC00" + (count);
        } else {
            id = "AC0" + (count);
        }
        balance = 300;
    }

    //withsraw method
    public void withdraw(double money) {
        if (balance - money >= 300) {
            balance -= money;
            System.out.println(money + " Rs successfully withdrawn.");
            System.out.println("Remaining Balance is : " + balance);
        } else {
            System.out.println("Insufficient balance to withdraw the amount.");
        }
    }

    //deposite method
    public void deposit(double amount) {
        balance += amount;
        System.out.println(amount + "Rs deposited to your account.");
        System.out.println("Current Balance is : " + balance);
    }

    //method for transfering money
    public void MoneyTransfer(ATM obj, double amount) {
        if (balance - amount >= 300) {
            balance -= amount;
            obj.balance += amount;
            System.out.println(amount + " Rs successfully Transferred.");
            System.out.println("Remaining Balance is : " + balance);
        } 
        else {
            System.out.println("Insufficient balance to transfer the amount.");
        }
    }
    
}