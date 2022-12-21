package lab2;

import java.util.ArrayList;
import java.util.Scanner;

public class Tester {
    private ArrayList<Circle> array = new ArrayList<>();
    private int num;


    public static void main(String [] args){

        Tester test = new Tester();
        double x,y,rad;
        Scanner sc = new Scanner(System.in);

        System.out.println("X = ");
        x = sc.nextDouble();
        System.out.println("Y = ");
        y = sc.nextDouble();
        System.out.println("Радиус = ");
        rad = sc.nextDouble();
        Point point = new Point(x,y);
        Circle circle = new Circle(point,rad);
        test.array.add(circle);






    }
}
