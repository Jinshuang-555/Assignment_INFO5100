package Assignment5.Q3;

public class PaypalStrategy implements PaymentStrategy{
    String email;

    public PaypalStrategy(String email) {
        this.email = email;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paypal: $" + amount);
    }
}
