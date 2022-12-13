package at.marlo.oo.basics.remote;

public class Battery {
    private int chargeStatus;

    public Battery(int chargeStatus) {
        this.chargeStatus = chargeStatus;
    }

    public int getChargeStatus() {return chargeStatus;}

    public void setChargeStatus(int chargeStatus) {
        this.chargeStatus = chargeStatus;
    }

    public void getStatus(){
        System.out.println(this.chargeStatus);
    }


}
