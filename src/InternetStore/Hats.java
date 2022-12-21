package InternetStore;

public enum Hats {
    CAP(4),
    HAT(5);
    private double price;

    public double getPrice() {
        return price;
    }



    Hats(double price) {
        this.price = price;
    }

}
