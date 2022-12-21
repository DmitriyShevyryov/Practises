package InternetStore;

public enum Jackets {
    BLACK(200),
    WHITE(205),
    RED(175);
    private double price;

    public double getPrice() {
        return price;
    }



    Jackets(double price) {
        this.price = price;
    }
}
