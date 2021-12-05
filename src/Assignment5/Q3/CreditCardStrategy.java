package Assignment5.Q3;

public class CreditCardStrategy implements PaymentStrategy{

    String cardNUmber;

    public CreditCardStrategy(String cardNUmber) {
        this.cardNUmber = cardNUmber;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Credit Card : $ " + amount);
    }
}
