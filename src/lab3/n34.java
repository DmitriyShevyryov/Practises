package lab3;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class n34 {
    public static void main(String[] args)
    {
        int n;
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите  размер массива - ");
        n = sc.nextInt();
        if((n < 1) | (n > 1000))
        {
            do {
                System.out.print("Введено неверное число. Повторите ввод - ");
                n = sc.nextInt();
            }
            while((n < 1) | (n > 1000));
        }
        int array[] = new int[n];
        for(int i=0; i< n; i++)
        {
            array[i] = rand.nextInt(n);
            System.out.print(array[i]+" ");
        }
        System.out.println();
        int evenArray[] = new int[n];
        int k=0;
        for(int i=0; i< n; i++)
        {
            if(array[i] % 2 == 0)
            {
                evenArray[k] = array[i];
                k++;
            }
        }
        for(int i=0; i< k;i++ )
        {
            System.out.print(evenArray[i]+" ");
        }


    }
}
