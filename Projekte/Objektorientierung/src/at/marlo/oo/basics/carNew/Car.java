package at.marlo.oo.basics.carNew;

public class Car {

    private String color;

    private double km;

    private int price;

    private Engine engine;

    private Producer producer;

    public Car(String color, double km, int price, Engine engine, Producer producer) {
        this.color = color;
        this.km = km;
        this.price = price;
        this.engine = engine;
        this.producer = producer;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Engine getEngine() {
        return engine;
    }

    public Producer getProducer() {
        return producer;
    }

    public double getKm() {
        return km;
    }

    public void setKm(double km) {
        this.km = km;
    }


    public double fuelConsumption() {
        if (this.km < 50000) {
            return this.getEngine().getFuelConsumption();
        } else
            return this.getEngine().getFuelConsumption() * 0.098 + this.getEngine().getFuelConsumption();
    }

    public double discountedPrice() {
        return this.price - this.price * this.getProducer().getDiscount();
    }
}
