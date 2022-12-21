package InternetStore;

public enum Sneakers {
    ADIDAS(100),
    NIKE(150),
    REEBOK(90),
    PUMA(80);
    private double price;

    public double getPrice() {
        return price;
    }



    Sneakers(double price) {
        this.price = price;
    }

}
