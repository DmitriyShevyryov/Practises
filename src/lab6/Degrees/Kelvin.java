package lab6.Degrees;

public class Kelvin implements Convertable{
    private double deg;

    public Kelvin(double deg) {
        this.deg = deg;
    }

    public double convert()
    {
        return(deg+273);
    }
}
