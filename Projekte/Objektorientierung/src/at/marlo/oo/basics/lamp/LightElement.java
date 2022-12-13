package at.marlo.oo.basics.lamp;

public class LightElement {

    private String name;
    private String color;
    private double powerUsage;
    private Boolean status;

    public LightElement(String name, String color, double powerUsage, Boolean status) {
        this.name = name;
        this.color = color;
        this.powerUsage = powerUsage;
        this.status = status;
    }

    public double getPowerUsage() {
        return powerUsage;
    }

    public void setPowerUsage(double powerUsage) {
        this.powerUsage = powerUsage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
