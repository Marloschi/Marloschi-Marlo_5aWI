package at.marlo.oo.basics.remote;

public class Main {
    public static void main(String[] args) {
        Battery b1 = new Battery(55);
        Battery b2 = new Battery(70);


        remote r1 = new remote("Hp", "Grey");
        r1.addBattery(b1);
        r1.addBattery(b2);


        r1.getStatus();
        r1.turnOn();
        r1.getStatus();
        r1.turnOff();
        r1.turnOn();
        r1.getStatus();

    }
}
