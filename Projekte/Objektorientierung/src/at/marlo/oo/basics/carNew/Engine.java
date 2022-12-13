package at.marlo.oo.basics.carNew;

public class Engine {
    public enum TYPE {DIESEL, GAS}


    private TYPE type;

    private double fuelConsumption;


    private int vMax;
    private int horsepower;

    public Engine(double fuelConsumption, int vMax, int horsepower, TYPE type) {
        this.fuelConsumption = fuelConsumption;
        this.vMax = vMax;
        this.horsepower = horsepower;
        this.type = type;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public int getvMax() {
        return vMax;
    }

    public TYPE getType() {
        return type;
    }
}
