package at.marlo.oo.basics.zoo;

public class Main {
    public static void main(String[] args) {
        Animal a1 = new Animal(40, 20);
        Animal a2 = new Animal(50, 30);

        Zoo zoo = new Zoo("Kinderzoo", "Elefantenstraße");
        zoo.addAnimal(a1);
        zoo.addAnimal(a2);
        zoo.printAnimals();

        Dog d1 = new Dog(15, 20);
        d1.bark();
        zoo.addAnimal(d1);

        zoo.printAnimals();


    }
}
