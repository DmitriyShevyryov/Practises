package lab3;

public class Circle implements Comparable<Circle> {
    private Point center;
    private int rad;

    public Circle(Point center, int rad) {
        this.center = center;
        this.rad = rad;
    }

    public Circle() {
    }

    public int getRad() {
        return rad;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public void setRad(int rad) {
        this.rad = rad;
    }

    @Override
    public int compareTo(Circle o) {
        return this.getRad() - o.getRad();
    }

    @Override
    public String toString() {
        return "Circle " +
                "center=" + center.getX() +" "+ center.getY() +
                ", rad=" + rad ;
    }
}
