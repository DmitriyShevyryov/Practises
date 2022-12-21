package ShapeAbstract;

import java.awt.*;
import java.util.Random;

abstract class Circle extends  Shape
{

    public Circle(Color color, double x, double y, double radius) {
        super(color, x,y,2*radius,2*radius);
    }



    public double getRadius() {
        return width/2;
    }

    public void setRadius(double radius) {
        this.width = 2*radius;
    }


    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + width/2 +
                '}';
    }
}
