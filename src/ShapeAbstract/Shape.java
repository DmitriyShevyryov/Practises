package ShapeAbstract;

import java.awt.*;

abstract class Shape {
    protected Color color;

    protected double x;
    protected double y;
    protected double width;
    protected double height;


    public Shape(Color color, double x, double y, double width, double height ) {
        this.color = color;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;

    }



    public Color getColor() {
        return color;
    }



    public void setColor(Color color) {
        this.color = color;
    }



    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public abstract String toString();
    abstract double getArea();
    abstract double getPerimetr();


}
