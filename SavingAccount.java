public class SavingAccount extends account {
    protected double OVERDRAFT_LIMIT = 0;

    public SavingAccount(int id, double balance,String date) {
        super(id, balance, date);
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount >= OVERDRAFT_LIMIT || balance - amount <= OVERDRAFT_LIMIT) 
            super.withdraw(amount);
        }
    

    @Override
    public String toString() {
        return "SavingsAccount{" + "net Balance =" + balance +'}';
    }
}