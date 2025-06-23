import java.util.Scanner;

abstract class Account {
    protected String accNo;
    protected double balance;

    public Account(String accNo, double balance) {
        this.accNo = accNo;
        this.balance = balance;
    }

    abstract void calculateInterest();

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited ₹" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount <= balance && amount > 0) {
            balance -= amount;
            System.out.println("Withdrew ₹" + amount);
        } else {
            System.out.println("Insufficient funds or invalid amount.");
        }
    }

    public void showDetails() {
        System.out.println(this); // calls toString()
    }

    @Override
    public String toString() {
        return "Account No: " + accNo + ", Balance: ₹" + balance;
    }
}

class SavingsAccount extends Account {
    public SavingsAccount(String accNo, double balance) {
        super(accNo, balance);
    }

    @Override
    void calculateInterest() {
        double interest = balance * 0.04;
        System.out.println("Savings Interest (4%): ₹" + interest);
    }
}

class CurrentAccount extends Account {
    public CurrentAccount(String accNo, double balance) {
        super(accNo, balance);
    }

    @Override
    void calculateInterest() {
        System.out.println("No interest for Current Account.");
    }
}

public class BankApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Account acc;

        System.out.println("Choose Account Type: 1. Savings  2. Current");
        int choice = sc.nextInt();

        System.out.print("Enter Account No: ");
        String accNo = sc.next();

        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();

        if (choice == 1) {
            acc = new SavingsAccount(accNo, balance);
        } else {
            acc = new CurrentAccount(accNo, balance);
        }

        int option;
        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Deposit\n2. Withdraw\n3. Show Details\n4. Calculate Interest\n5. Exit");
            System.out.print("Enter choice: ");
            option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    acc.deposit(sc.nextDouble());
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    acc.withdraw(sc.nextDouble());
                    break;
                case 3:
                    acc.showDetails();
                    break;
                case 4:
                    acc.calculateInterest();
                    break;
                case 5:
                    System.out.println("Thank you!");
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        } while (option != 5);

        sc.close();
    }
}
