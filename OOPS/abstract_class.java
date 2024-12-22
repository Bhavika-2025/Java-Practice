package OOPS;

abstract class Animal {

    abstract void walk();

    Animal() {
        System.out.println("Animal is created");
    }

    public void eat() {
        System.out.println("Animals eat plants and other thungs");
    }

}

class Horse extends Animal {

    Horse() {
        System.out.println("Horse is created");
    }

    public void walk() {
        System.out.println("Walks on 4 legs");
    }
}

class Chicken extends Animal {

    Chicken() {
        System.out.println("Chicken is created");
    }

    public void walk() {
        System.out.println("Walks on 2 legs");
    }
}

public class abstract_class {

    public static void main(String[] args) {

        Horse h = new Horse();
        h.walk();
        Chicken c = new Chicken();
        c.eat();

    }
}
