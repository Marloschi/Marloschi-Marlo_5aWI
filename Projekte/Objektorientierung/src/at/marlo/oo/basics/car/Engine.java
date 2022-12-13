package at.marlo.oo.basics.car;

import java.sql.SQLOutput;

public class Engine {
    public enum TYPE {DIESEL, GAS}
    private int horsepower;
    private TYPE type; //Diesel oder Benzin
    private int fuelConsumption;
    private int engineUtilization;

    public Engine(int horsepower, TYPE type, int fuelConsumption) {
        this.horsepower = horsepower;
        this.type = type;
        this.fuelConsumption = fuelConsumption;
    }



    public void drive(){
        System.out.println("The engine runs at " + this.engineUtilization + " with " + this.horsepower +"hp");
        System.out.println("Therefore we have a speed of " + (this.horsepower*engineUtilization)/60 + " km/h");
    }

    public int getHorsepower() {
        return horsepower;
    }

    public TYPE getType() {
        return type;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public int getEngineUtilization() {
        return engineUtilization;
    }

    public void setEngineUtilization(int engineUtilization) {
        this.engineUtilization = engineUtilization;
    }
}
