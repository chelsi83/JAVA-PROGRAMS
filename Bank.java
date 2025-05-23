class BankAccount {
    private String accountHolder;
    private double balance;

    // Constructor
    public BankAccount(String holder, double balance) {
        this.accountHolder = holder;
        this.balance = balance;
    }

    // Getter and Setter
    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String holder) {
        this.accountHolder = holder;
    }

    public double getBalance() {
        return balance;
    }

    // Business logic encapsulated
    public void deposit(double amount) {
        if (amount > 0)
            balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance)
            balance -= amount;
    }
}

public class Bank {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("Alice", 1000);
        acc.deposit(500);
        acc.withdraw(300);
        System.out.println("Account Holder: " + acc.getAccountHolder());
        System.out.println("Final Balance: " + acc.getBalance());
    }
}
