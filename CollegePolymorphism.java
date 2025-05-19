

class Person {
    void displayRole() {
        System.out.println("I am a person in the college.");
    }
}

class Student extends Person {
    @Override
    void displayRole() {
        System.out.println("I am a student. I attend classes and study.");
    }
}

class Teacher extends Person {
    @Override
    void displayRole() {
        System.out.println("I am a teacher. I teach and guide students.");
    }
}

class Staff extends Person {
    @Override
    void displayRole() {
        System.out.println("I am a staff member. I manage college facilities.");
    }
}

public class CollegePolymorphism {
    public static void main(String[] args) {
        // Polymorphic references
        Person p;

        p = new Student();
        p.displayRole();  // Output: I am a student...

        p = new Teacher();
        p.displayRole();  // Output: I am a teacher...

        p = new Staff();
        p.displayRole();  // Output: I am a staff member...
    }
}
