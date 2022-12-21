package lab3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
public class Tester  {
    private ArrayList<Circle> array = new ArrayList<Circle>();
    private int num;

    public ArrayList<Circle> getArray() {
        return array;
    }


    public Circle smallest()
    {
        int min = 1000000000;
        Circle Min = new Circle();
        Min.setRad(min);
        for(int i=0; i< array.size(); i++)
        {
            if(this.array.get(i).getRad() < Min.getRad())
                Min = this.array.get(i);

        }
        return Min;
    }
    public Circle biggest()
    {
        int max = -1000000000;
        Circle Max = new Circle();
        Max.setRad(max);
        for(int i=0; i< array.size(); i++)
        {
            if(this.array.get(i).getRad() > Max.getRad())
                Max = this.array.get(i);

        }
        return Max;
    }
    public void toSort()
    {
        Collections.sort(this.array);
    }
    public void addCircle()
    {
        Random rand = new Random();
        Point point = new Point(Math.random()*100,Math.random()*100);
        Circle circle = new Circle(point, rand.nextInt(100));
        this.array.add(circle);
    }
    public void show()
    {
        for(int i=0; i < this.array.size(); i++)
        {
            System.out.print(this.array.get(i).toString()+" ");
        }
        System.out.println();
    }
    public static void main(String [] args)
    {
        Tester test = new Tester();
        test.addCircle();
        test.addCircle();
        test.addCircle();
        test.show();
        System.out.println("Самая маленькая - " +test.smallest());
        System.out.println("Самая большая - " +test.biggest());
        test.toSort();
        test.show();
    }
}