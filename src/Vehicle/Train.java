package Vehicle;

import java.util.Scanner;

public abstract class Train extends Vehicle {
    public Train(double speed, double fuel_waste) {
        super(speed, fuel_waste);
    }

    public Train() {
    }

    @Override
    public double getTime(double distance) {
        return distance/speed + distance/20*0.1;
    }

    @Override
    public double getCost(double distance) {
        return distance/fuel_waste * 6;  // в кВт на км
    }
    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Расход энергии (км/кВт) - ");
        fuel_waste = sc.nextDouble();
        System.out.println("Скорость поезда - ");
        speed = sc.nextDouble();


    }
}
