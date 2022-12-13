package at.marlo.oo.basics.figures;

public class Main {
    public static void main(String[] args) {

        Circle c1 = new Circle("Circle 1", 10);
        System.out.println(c1.getArea());
        System.out.println(c1.getName());


        Rectangle r1 = new Rectangle("Rectangle 1", 10, 5);
        System.out.println(r1.getArea());
        System.out.println(r1.getName());

        Square s1 = new Square("Square 1", 10);
        System.out.println(s1.getArea());
        System.out.println(s1.getName());

        Cube cu1 = new Cube("Cube 1", 10);
        System.out.println(cu1.getArea());
        System.out.println(cu1.getName());

    }
}
