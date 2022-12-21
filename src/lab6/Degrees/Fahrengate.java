package lab6.Degrees;

public class Fahrengate implements Convertable{
    private double deg;

    public Fahrengate(double deg) {
        this.deg = deg;
    }

    public double convert()
    {
        return(deg*1.8 + 32);
    }
}
