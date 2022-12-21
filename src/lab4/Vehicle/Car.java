package lab4.Vehicle;

import java.util.Scanner;

public abstract class Car extends Vehicle {

    public Car(double speed, double fuel_waste) {
        super(speed, fuel_waste);
    }

    @Override
    public double getTime(double distance) {
        return distance/speed + distance/200*0.25;
    }

    public Car() {
    }

    @Override
    public double getCost(double distance) {
        return distance/fuel_waste * 50;
    }
    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Расход бензина (км/л) - ");
        fuel_waste = sc.nextDouble();
        System.out.println("Скорость автомобиля - ");
        speed = sc.nextDouble();


    }
}
