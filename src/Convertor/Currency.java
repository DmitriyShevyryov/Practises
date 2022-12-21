package Convertor;

public class Currency {
    private String name;
    private double rating;

    public double getRating() {
        return rating;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Currency(String name, double rating) {
        this.name = name;
        this.rating = rating;
    }

    public Currency() {
    }
}
