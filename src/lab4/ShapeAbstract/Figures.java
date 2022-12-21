package lab4.ShapeAbstract;

import java.awt.*;

public class Figures extends Shape
{
public Figures(Color color, double x, double y, double width, double height)
{
    super( color,  x,  y,  width,  height);

}


    @Override
    public String toString() {
        return null;
    }

    @Override
    double getArea() {
        return 0;
    }

    @Override
    double getPerimetr() {
        return 0;
    }
}
