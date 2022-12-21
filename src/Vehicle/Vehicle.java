package Vehicle;

import java.util.Scanner;

abstract class Vehicle {
    protected double speed;
    protected double fuel_waste;

    public Vehicle(double speed, double fuel_waste) {
        this.speed = speed;
        this.fuel_waste = fuel_waste;
    }

    public double getSpeed() {
        return speed;
    }

    public double getFuel_waste() {
        return fuel_waste;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void setFuel_waste(double fuel_waste) {
        this.fuel_waste = fuel_waste;
    }

    public Vehicle() {
    }

    public abstract double getTime(double distance);
    public abstract double getCost(double distance);
    public abstract void input();
    public static void main(String [] main)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Дистанция - ");
        double distance = sc.nextDouble();
        System.out.println("Выберите т/c для расчета: 1 - автомобиль 2 - самолет 3 - поезд 4 - корабль");
        int c = sc.nextInt();
        switch (c)
        {
            case 1:
            {
                Car car = new Car(){};
                car.input();
                System.out.println("Время - "+car.getTime(distance)+" часов");
                System.out.println("Стоимость - "+car.getCost(distance)+" руб");
                break;
            }
            case 2:
            {
                Jet jet = new Jet(){};
                jet.input();
                System.out.println("Время - "+jet.getTime(distance)+" часов");
                System.out.println("Стоимость - "+jet.getCost(distance)+" руб");
                break;
            }
            case 3:
            {
                Train train = new Train(){};
                train.input();
                System.out.println("Время - "+train.getTime(distance)+" часов");
                System.out.println("Стоимость - "+train.getCost(distance)+" руб");
                break;
            }
            case 4:
            {
                Ship ship = new Ship(){};
                ship.input();
                System.out.println("Время - "+ship.getTime(distance)+" часов");
                System.out.println("Стоимость - "+ship.getCost(distance)+" руб");
                break;
            }
        }
    }

}
