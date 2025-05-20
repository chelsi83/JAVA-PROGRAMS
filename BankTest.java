abstract class BankAccount {
    String accountHolder;
    double balance;

    BankAccount(String name, double balance) {
        this.accountHolder = name;
        this.balance = balance;
    }

    abstract void withdraw(double amount); // Abstract method

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    void showBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

class SavingsAccount extends BankAccount {
    SavingsAccount(String name, double balance) {
        super(name, balance);
    }

    @Override
    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance.");
        }
    }
}

public class BankTest {
    public static void main(String[] args) {
        BankAccount account = new SavingsAccount("Alice", 1000.0);
        account.deposit(500);
        account.withdraw(300);
        account.showBalance();
    }
}
