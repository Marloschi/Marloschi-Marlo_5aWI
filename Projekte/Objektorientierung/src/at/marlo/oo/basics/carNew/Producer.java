package at.marlo.oo.basics.carNew;

public class Producer {

    private String name;

    private String countryOfOrigin;

    private double discount;

    public Producer(String name, String countryOfOrigin, double discount) {
        this.name = name;
        this.countryOfOrigin = countryOfOrigin;
        this.discount = discount;
    }

    public String getName() {
        return name;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public double getDiscount() {
        return discount;
    }
}
