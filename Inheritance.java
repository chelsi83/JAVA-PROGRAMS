
class Animal {
    String name;

    public void eat() {
        System.out.println(name + " is eating.");
    }

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }
}

// Derived class (Child class or Subclass)
class Dog extends Animal {

    public void bark() {
        System.out.println(name + " is barking.");
    }
}

// Main class to run the example
public class Inheritance {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.name = "Buddy";
        myDog.eat();
        myDog.sleep();
        myDog.bark();
    }
}
