package lab1;
import java.util.Scanner;
public class lab7 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int n = sc.nextInt();
        System.out.println(fac(n));

    }
    public static int fac(int n)
    {
        int res = 1;
        while(n != 0)
        {
            res *= n;
            n -= 1;
        }
        return res;

    }
}
