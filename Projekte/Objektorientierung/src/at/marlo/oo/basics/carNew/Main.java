package at.marlo.oo.basics.carNew;

public class Main {
    public static void main(String[] args) {

        Engine e1 = new Engine(6, 250, 275, Engine.TYPE.DIESEL);
        Engine e2 = new Engine(12, 390, 975, Engine.TYPE.GAS);
        Producer p1 = new Producer("BMW", "Germany", 0.05);

        Car c1 = new Car("Red", 5000, 230000, e1, p1);
        Car c2 = new Car("Mint", 65000, 500000, e2, p1);

        System.out.println(c1.fuelConsumption());
        System.out.println(c2.fuelConsumption());

        System.out.println(c1.discountedPrice());
        System.out.println(c2.discountedPrice());
    }
}
