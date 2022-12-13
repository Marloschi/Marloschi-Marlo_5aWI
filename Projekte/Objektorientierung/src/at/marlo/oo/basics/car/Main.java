package at.marlo.oo.basics.car;

public class Main {
    public static void main(String[] args) {

        Engine e1 = new Engine(100, Engine.TYPE.DIESEL, 6);
        Tank t1 = new Tank(50);
        rearMirror r1 = new rearMirror(100,0);
        rearMirror r2 = new rearMirror(90,-40);
        Tire tire1 = new Tire("pirelli", 50);
        Tire tire2 = new Tire("pirelli", 50);
        Tire tire3 = new Tire("pirelli", 40);
        Tire tire4 = new Tire("pirelli", 40);
        e1.setEngineUtilization(100);
        e1.drive();

        Car c1 = new Car("Mercedes","M0123","red", t1, e1);
        c1.addMirror(r1);
        c1.addMirror(r2);
        c1.addTires(tire1);
        c1.addTires(tire2);
        c1.addTires(tire3);
        c1.addTires(tire4);



        System.out.println(c1.getRearMirrors().get(0).getPosition());
        System.out.println(c1.getTires().get(0).getRadius());

    }
}