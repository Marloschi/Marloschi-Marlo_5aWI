package at.marlo.oo.basics.accounts;

import java.sql.SQLOutput;

public class CreditAccount extends BaseAccount {
    public CreditAccount(double balance) {
        super(balance);
    }

    public double Withdraw(double number1) {
        if (number1 <= 500 && getBalance() > number1) {
            setBalance(getBalance() - number1);
            System.out.println("Neuer Kontostand ist " + getBalance());

        } else {
            System.out.println("Sie können maximal 500€ abheben");
        }
        return getBalance();
    }
}
