package Assignment5.Q3;

public class Item {
    String Id;
    int price;

    public Item(String id, int price) {
        Id = id;
        this.price = price;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
