package ShapeAbstract;

import java.awt.*;
import java.util.Random;

public class Square extends Rectangle{
    public Square(Color color, int x, int y, double width)
    {
        super(color, x,y,width,width);;
    }

    public double getSide()
    {
        return width;
    }
    public void setSide(double side)
    {
        this.width = side;
    }

    @Override
    public double getWidth() {
        return super.getWidth();
    }

    @Override
    public String toString() {
        return null;
    }




}
