interface PaymentGateway {
    void pay(double amount);
}

class CreditCardPayment implements PaymentGateway {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card.");
    }
}

class UpiPayment implements PaymentGateway {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using UPI.");
    }
}

public class PaymentTest {
    public static void main(String[] args) {
        PaymentGateway payment1 = new CreditCardPayment();
        PaymentGateway payment2 = new UpiPayment();

        payment1.pay(250.00);
        payment2.pay(99.99);
    }
}
