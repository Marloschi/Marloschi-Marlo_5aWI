package at.marlo.oo.basics.car;

public class Tire {
    private String brand;
    private int radius;

    public Tire(String brand, int radius) {
        this.brand = brand;
        this.radius = radius;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
