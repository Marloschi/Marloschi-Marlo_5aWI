package at.marlo.oo.basics.figures;

public class Square extends Figure {
    public double base;

    public Square(String name, double base) {
        super(name);
        this.base = base;
    }

    @Override
    public double getArea() {
        return Math.pow(base, 2);
    }
}
