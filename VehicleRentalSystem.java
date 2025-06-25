import java.util.Scanner;

// Abstract base class
abstract class Vehicle {
    protected String vehicleNumber;
    protected String model;
    protected double ratePerDay;

    public Vehicle(String vehicleNumber, String model, double ratePerDay) {
        this.vehicleNumber = vehicleNumber;
        this.model = model;
        this.ratePerDay = ratePerDay;
    }

    public abstract double calculateRent(int days);

    public void showDetails() {
        System.out.println("Vehicle No: " + vehicleNumber);
        System.out.println("Model: " + model);
        System.out.println("Rate/Day: ₹" + ratePerDay);
    }
}

// Car class (inherits Vehicle)
class Car extends Vehicle {
    private boolean isLuxury;

    public Car(String vehicleNumber, String model, double ratePerDay, boolean isLuxury) {
        super(vehicleNumber, model, ratePerDay);
        this.isLuxury = isLuxury;
    }

    @Override
    public double calculateRent(int days) {
        double total = ratePerDay * days;
        if (isLuxury) {
            total += 1000; // luxury fee
        }
        return total;
    }
}

// Bike class (inherits Vehicle)
class Bike extends Vehicle {
    public Bike(String vehicleNumber, String model, double ratePerDay) {
        super(vehicleNumber, model, ratePerDay);
    }

    @Override
    public double calculateRent(int days) {
        return ratePerDay * days;
    }
}

// Main class
public class VehicleRentalSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vehicle vehicle;

        System.out.println("Welcome to Vehicle Rental System!");
        System.out.println("Choose Vehicle Type:");
        System.out.println("1. Car");
        System.out.println("2. Bike");
        int choice = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter Vehicle Number: ");
        String number = sc.nextLine();

        System.out.print("Enter Vehicle Model: ");
        String model = sc.nextLine();

        System.out.print("Enter Rate per Day (₹): ");
        double rate = sc.nextDouble();

        if (choice == 1) {
            System.out.print("Is this a luxury car? (true/false): ");
            boolean isLuxury = sc.nextBoolean();
            vehicle = new Car(number, model, rate, isLuxury);
        } else {
            vehicle = new Bike(number, model, rate);
        }

        System.out.print("Enter number of rental days: ");
        int days = sc.nextInt();

        System.out.println("\n--- Vehicle Details ---");
        vehicle.showDetails();
        double rent = vehicle.calculateRent(days);
        System.out.println("Total Rent for " + days + " day(s): ₹" + rent);

        sc.close();
    }
}
