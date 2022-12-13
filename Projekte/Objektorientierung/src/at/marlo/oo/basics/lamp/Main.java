package at.marlo.oo.basics.lamp;

public class Main {
    public static void main(String[] args) {
        LightElement le1 = new LightElement("1. Element", "red", 5, true);
        LightElement le2 = new LightElement("2. Element", "red", 4, false);
        LightElement le3 = new LightElement("3. Element", "red", 1, true);
        LightElement le4 = new LightElement("4. Element", "red", 7, false);
        LightElement le5 = new LightElement("5. Element", "red", 8, false);

        Lamp l1 = new Lamp("red");
        l1.addLightElement(le1);
        l1.addLightElement(le2);
        l1.addLightElement(le3);
        l1.addLightElement(le4);
        l1.addLightElement(le5);

        l1.printNamesOfLightElements();
        l1.turnAllOn();
        System.out.println(l1.getOverallPowerUsage() + " Verbraucht die Lampe Insgesamt");


    }
}
