import java.util.Scanner;

// Custom Exception Class
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

// BankAccount Class
class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accNo, double initialBalance) {
        this.accountNumber = accNo;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit amount must be positive.");
            return;
        }
        balance += amount;
        System.out.println("Deposited ₹" + amount);
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be positive.");
        } else if (amount > balance) {
            throw new InsufficientFundsException("Withdrawal failed: Insufficient balance.");
        }
        balance -= amount;
        System.out.println("Withdrew ₹" + amount);
    }

    public void showBalance() {
        System.out.println("Account Number: " + accountNumber + ", Balance: ₹" + balance);
    }
}

// Main Class
public class BankAppCustomException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create bank account with initial balance
        BankAccount account = new BankAccount("AC123456", 5000);

        account.showBalance();

        System.out.print("Enter amount to withdraw: ");
        double amount = sc.nextDouble();

        try {
            account.withdraw(amount);
        } catch (InsufficientFundsException e) {
            System.out.println("Exception Caught: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid Input: " + e.getMessage());
        }

        account.showBalance();

        sc.close();
    }
}
