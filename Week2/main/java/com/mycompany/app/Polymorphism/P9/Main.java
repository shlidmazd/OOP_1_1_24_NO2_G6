package Week2.main.java.com.mycompany.app.Polymorphism.P9;

// Base class: Rodent
abstract class Rodent {
    protected String name;

    public Rodent(String name) {
        this.name = name;
    }

    // Common methods for all rodents
    public abstract void makeSound();
    public abstract void move();
    public abstract void eat();
}

// Derived class: Mouse
class Mouse extends Rodent {
    public Mouse(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " squeaks!");
    }

    @Override
    public void move() {
        System.out.println(name + " scurries around quickly.");
    }

    @Override
    public void eat() {
        System.out.println(name + " nibbles on cheese.");
    }
}

// Derived class: Gerbil
class Gerbil extends Rodent {
    public Gerbil(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " chirps!");
    }

    @Override
    public void move() {
        System.out.println(name + " hops around energetically.");
    }

    @Override
    public void eat() {
        System.out.println(name + " chews on seeds.");
    }
}

// Derived class: Hamster
class Hamster extends Rodent {
    public Hamster(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " makes little clicks!");
    }

    @Override
    public void move() {
        System.out.println(name + " runs on its wheel.");
    }

    @Override
    public void eat() {
        System.out.println(name + " snacks on pellets.");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Create an array of Rodent objects
        Rodent[] rodents = {
            new Mouse("Mickey"),
            new Gerbil("Gerry"),
            new Hamster("Hammy")
        };

        // Call base-class methods for each rodent
        for (Rodent rodent : rodents) {
            rodent.makeSound();
            rodent.move();
            rodent.eat();
            System.out.println("---------------------");
        }
    }
}
