package at.marlo.oo.basics.remote;

import at.marlo.oo.basics.car.Tire;

import java.util.ArrayList;
import java.util.List;

public class remote {
    private String brand;
    private String color;
    private List<Battery> batteries;

    public remote(String brand, String color) {
        this.brand = brand;
        this.color = color;
        this.batteries = new ArrayList<>();
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }


    //Methoden
    public void addBattery(Battery batteries) {
        this.batteries.add(batteries);
    }


    public void turnOn() {
        System.out.println("Verbraucher angeschlossen");
        for (int i = 0; i < this.batteries.size(); i++) {
            this.batteries.get(i).setChargeStatus(this.batteries.get(i).getChargeStatus() - 5);
            System.out.println("Batterie " + (i + 1) + " hat noch " + this.batteries.get(i).getChargeStatus() + "% Ladung");
        }

    }

    public void turnOff() {
        System.out.println("Kein Verbraucher angeschlossen");
    }


    public void getStatus() {
        int sum = 0;

        for (int i = 0; i < this.batteries.size(); i++) {

            sum += this.batteries.get(i).getChargeStatus();
            // System.out.println(sum);
        }
        System.out.println("Der Mittelwert der Batterien ist " + sum / this.batteries.size() + "%");


    }
}
