package lab4;

public enum Tshirts {
    STRIPPED(11),
    SPOTTED(13);
    private double price;

    public double getPrice() {
        return price;
    }



    Tshirts(double price) {
        this.price = price;
    }
}
