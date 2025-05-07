public class Main{
    public static void main(String[] args) {
        // Create object using constructor
        Employee emp = new Employee("Alice", 25, 50000);

        // Access data through getters
        System.out.println("Name: " + emp.getName());
        System.out.println("Age: " + emp.getAge());
        System.out.println("Salary: " + emp.getSalary());

        // Modify data through setters
        emp.setAge(21); // Will show validation message
        emp.setSalary(55000);
        emp.setName("Chelsi");

        // Updated details
        System.out.println("\nUpdated Details:");
        System.out.println("Name: " + emp.getName());
        System.out.println("Age: " + emp.getAge());
        System.out.println("Salary: " + emp.getSalary());
    }
}

// 👇 Employee class below the main class
 class Employee {
    private String name;
    private int age;
    private double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age >= 18) {
            this.age = age;
        } else {
            System.out.println("Age must be 18 or older.");
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if(salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("Salary must be positive.");
        }
    }
}
