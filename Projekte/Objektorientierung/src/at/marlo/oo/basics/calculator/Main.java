package at.marlo.oo.basics.calculator;

public class Main {
    public static void main(String[] args) {

        Calculator c1 = new Calculator();
        ScienceCalculator sc1 = new ScienceCalculator();
        RootCalculator rc1 = new RootCalculator();
        System.out.println(c1.addNumbers(5,10));
        System.out.println(sc1.addNumbers(100,78));
        System.out.println(sc1.cos(5));
        System.out.println(rc1.addNumbers(5,100));
        System.out.println(rc1.root(64));
    }
}
