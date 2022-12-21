package lab1;

import java.util.Scanner;

public class lab4 {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int []array = new int[10];
        int sum = 0;
        int sum1 = 0;
        int max = array[0];
        int min = 1000000000;
        for(int i=0; i<10; i++)
        {
            array[i] = sc.nextInt();

        }
        int k = 0;
        do
        {
            sum += array[k];
            k++;

        }
        while(k<10);
        int t = 0;
        while(t < 10)
        {
            sum1 += array[t];
            t++;
        }
        for(int i=0; i<10; i++)
        {
            if(array[i] > max)
                max = array[i];
            if(array[i] <= min)
                min = array[i];
        }
        System.out.println("Сумма в цикле do while: "+sum);
        System.out.println("Сумма в цикле  while: "+sum1);
        System.out.println("Максимальное число: "+max);
        System.out.println("Минимальное число: "+min);






    }
}
