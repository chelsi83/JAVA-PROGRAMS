

class MathOperations {
    // Compile-time polymorphism: Method Overloading
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }
}

class Animal {
    // Runtime polymorphism: Method Overriding
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class Polymorphism
{
    public static void main(String[] args) {
        System.out.println("=== Compile-Time Polymorphism ===");
        MathOperations mo = new MathOperations();
        System.out.println("add(2, 3): " + mo.add(2, 3));
        System.out.println("add(1, 2, 3): " + mo.add(1, 2, 3));
        System.out.println("add(2.5, 3.5): " + mo.add(2.5, 3.5));

        System.out.println("\n=== Runtime Polymorphism ===");
        Animal a;

        a = new Dog();
        a.sound();  // Output: Dog barks

        a = new Cat();
        a.sound();  // Output: Cat meows
    }
}
