package Vehicle;

import java.util.Scanner;

public abstract class Ship extends Vehicle {
    public Ship(double speed, double fuel_waste) {
        super(speed, fuel_waste);
    }

    public Ship() {
    }

    @Override
    public double getTime(double distance) {
        return distance/speed + 48;
    }

    @Override
    public double getCost(double distance) {
        return distance/fuel_waste * 9800;
    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Расход мазута (км/тонны) - ");
        fuel_waste = sc.nextDouble();
        System.out.println("Скорость корабля - ");
        speed = sc.nextDouble();


    }
}
