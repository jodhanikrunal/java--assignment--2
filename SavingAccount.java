public class SavingAccount extends account {
    //define overdraft limit = 0 
    protected double OVERDRAFT_LIMIT = 0;

    //perameterized constructor with super class argument
    public SavingAccount(int id, double balance,String date) {
        super(id, balance, date);
    }

    //override withdraw method
    @Override
    public void withdraw(double amount) {
        if (balance - amount >= OVERDRAFT_LIMIT || balance - amount <= OVERDRAFT_LIMIT) 
            super.withdraw(amount);
        }
    
        //override tostring
    @Override
    public String toString() {
        return "SavingsAccount{" + "net Balance =" + balance +'}';
    }
}