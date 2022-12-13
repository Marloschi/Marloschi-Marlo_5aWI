package at.marlo.oo.basics.accounts;

public class BaseAccount {
    private double balance;


    public BaseAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
