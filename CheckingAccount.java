public class CheckingAccount extends account {

    //take overdraft limit = -100
    protected double OVERDRAFT_LIMIT = -100;

    //create constructor with suoer class arguments
    public CheckingAccount(int id, double balance,String date) {
        super(id, balance,date);
    }

    //override withdraw method
    @Override
    public void withdraw(double amount) {
        if (balance - amount >= OVERDRAFT_LIMIT) {
            super.withdraw(amount);
        }
        else
        System.out.println("Over drawing is passing the given limit  :");
    }

    //override tostring method
    @Override
    public String toString() {
        return "CheckingAccount{"+ "mBalance=" + balance +'}';
    }
}