package ShapeAbstract;

import java.awt.*;
import java.util.Random;

abstract class Rectangle extends Shape {



    public Rectangle(Color color, int x, int y, double width, double height)
    {
        super(color, x,y,width,height);
    }





    @Override
    public String toString()
    {
        return "Rectangle{" +
                "width=" + width +"length="+height+
                '}';
    }

    @Override
    public double getArea()
    {
        return width*height;
    }

    @Override
    public  double getPerimetr() {
        return 2*(height+width);
    }
}
