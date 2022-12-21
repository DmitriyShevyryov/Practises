package lab6.Degrees;

import java.util.Scanner;

public class Test {
    public static void main(String[] args)
    {
        System.out.println("Введите температуру в нрадусах Цельсия: ");
        Scanner sc = new Scanner(System.in);
        double temp = sc.nextDouble();
        System.out.println("Выберите шкалу: ");
        String scale = sc.next();
        switch (scale)
        {
            case "Кельвин":
            {
                Kelvin kelvin = new Kelvin(temp);
                System.out.println(kelvin.convert());
                break;
            }
            case "Фаренгейт":
            {
                Fahrengate far = new Fahrengate(temp);
                System.out.println(far.convert());
                break;
            }
        }

    }
}
