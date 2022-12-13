package at.marlo.oo.basics.figures;

public class Cube extends Square {
    public Cube(String name, double base) {
        super(name, base);
    }

    @Override
    public double getArea() {
        return super.getArea() * 6; //Würfel hat 6 Quadrate als Fläche
    }
}
