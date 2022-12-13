package at.marlo.oo.basics.figures;

public class Rectangle extends Figure {
    private double length;
    private double width;

    public Rectangle(String name, double length, double width) {
        super(name);
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return this.length * this.width;
    }
}
