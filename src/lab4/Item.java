package lab4;

import java.text.NumberFormat;

public class Item {
    private String name;
    private double price;

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Item(String name)
    {
        this.name = name;
    }

    @Override
    public String toString() {
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance();
        String price1 = numberFormat.format(price);
        return name +
                ", price = " + price1 ;
    }
}
