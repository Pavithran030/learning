package scratch_ja;

abstract class Car { // Abstract Class...
    abstract void explore(); // Abstract Method...

    abstract void finishing();

    public void drive() {
        System.out.println("i am driving the car...");
    }
}

class Audi extends Car { // Concrete class

    public void explore() {
        System.out.println("Explore the car outer view....");
    }

    public void finishing() {
        System.out.println("The overview is  finished....");
    }

    public void testing() {
        System.out.println("i am testing the car...");
    }
}

public class Abstract_keyword {
    public static void main(String[] args) {
        Audi c1 = new Audi();
        c1.drive();
        c1.testing();
        c1.explore();
    }
}
