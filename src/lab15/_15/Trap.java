package lab15._15;

public class Trap {
    public static double f(double x, double y)
    {
        return x*x + 0.2*y;
    }
    public static double func(double x0, double y0, double x1)
    {
        return y0 + 0.25*(f(x0,y0) + f(x1, y0 + 0.5*f(x0,y0)));
    }
    public static void main(String[] args)
    {

        System.out.println(func(0,1,0.5));
        System.out.println(func(0.5,1.1675,1));
        System.out.println(func(1,1.6088375,1.5));
        System.out.println(func(1.5,2.61526544,2));


    }
}
