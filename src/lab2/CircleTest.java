package lab2;
import n6.Circle;

import java.util.Scanner;
public class CircleTest {
    public static void compare(n6.Circle one, n6.Circle two)
    {
        if(one.getRad()>two.getRad())
            System.out.println("Окружность "+one.getName()+" больше окружности "+two.getName());
        else
        {
            if(one.getRad()<two.getRad())
                System.out.println("Окружность "+two.getName()+" больше окружности "+one.getName());
            else
                System.out.println("Окружности равны");
        }


    }
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите параметры первой окружности");
        String name = sc.next();
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double rad = sc.nextDouble();
        n6.Circle c1 = new n6.Circle(name,x,y,rad);
        System.out.println("Введите параметры второй окружности");
        name = sc.next();
        x = sc.nextDouble();
        y = sc.nextDouble();
        rad = sc.nextDouble();
        n6.Circle c2 = new Circle(name,x,y,rad);
        compare(c1,c2);
    }
}
