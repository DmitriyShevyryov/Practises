package lab4.Vehicle;

import java.util.Scanner;

public abstract class Jet extends Vehicle {
    public Jet(double speed, double fuel_waste) {
        super(speed, fuel_waste);
    }

    public Jet() {
    }

    @Override
    public double getTime(double distance) {
        return distance/speed + 1;
    }

    @Override
    public double getCost(double distance) {
        return distance/fuel_waste * 60;
    }
    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Расход керосина (км/л) - ");
        fuel_waste = sc.nextDouble();
        System.out.println("Скорость самолет - ");
        speed = sc.nextDouble();


    }
}
