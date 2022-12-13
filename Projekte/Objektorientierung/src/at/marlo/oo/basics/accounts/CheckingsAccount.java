package at.marlo.oo.basics.accounts;

public class CheckingsAccount extends BaseAccount {


    public CheckingsAccount(double balance) {
        super(balance);

    }

    public double Withdraw(double number1) {
        if ((getBalance() - number1) >= 0) {
            setBalance(getBalance() - number1);
            System.out.println("Neuer Kontostand ist " + getBalance());
        } else {
            System.out.println("Du Geringverdiener hast zu wenig Geld um diesen Betrag abzuheben");
        }
        return getBalance() - number1;
    }
}
