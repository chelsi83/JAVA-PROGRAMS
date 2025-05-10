
abstract class Animal {
    String name;


    abstract void makeSound();


    public void sleep() {
        System.out.println(name + " is sleeping.");
    }
}


class Dog extends Animal {

    public void makeSound() {
        System.out.println(name + " says: Woof!");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.name = "Bruno";
        myDog.makeSound();
        myDog.sleep();
    }
}
