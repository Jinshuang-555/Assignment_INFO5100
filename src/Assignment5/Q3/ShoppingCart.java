package Assignment5.Q3;

public class ShoppingCart {

    int total = 0;

    public ShoppingCart() {
    }

    public void addItem(Item item) {
        total += item.getPrice();
    }

    public void removeItem(Item item) {
        total -= item.getPrice();
    }
    public int calculateTotal() {
        return total;
    }
    public void pay( PaymentStrategy paymentStrategy) {
        paymentStrategy.pay(total);
    }
}
