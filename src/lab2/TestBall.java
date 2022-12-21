package lab2;
import java.util.Scanner;
public class TestBall {
    public static void main(String[] args)
    {
        double x,y;
        Ball myach = new Ball();
        System.out.println(myach.toString());
        Scanner sc = new Scanner(System.in);
        do
        {
            System.out.println("X + ");
            x = sc.nextDouble();
            System.out.println("Y + ");
            y = sc.nextDouble();
            myach.move(x,y);
            System.out.println(myach.toString());
        }
        while(sc != null);
    }
}
