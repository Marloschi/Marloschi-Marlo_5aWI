package at.marlo.oo.basics.accounts;

public class Main {
    public static void main(String[] args) {

        CheckingsAccount ca1 = new CheckingsAccount(1000.60);
        ca1.Withdraw(1000);
        ca1.Withdraw(2000);


        CreditAccount cra1 = new CreditAccount(1000);
        cra1.Withdraw(10);
        cra1.Withdraw(600);

    }
}
