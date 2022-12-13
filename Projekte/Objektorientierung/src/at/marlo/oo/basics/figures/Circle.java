package at.marlo.oo.basics.figures;

public class Circle extends Figure {

    private double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return (Math.pow(this.radius, 2) * Math.PI) / 2;
    }
}
