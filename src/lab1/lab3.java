package lab1;

public class lab3 {
    public static void main(String [] args)
    {
        int []array = {1,2,3,4,5,6,7,8,9,10};
        int sum = 0;
        for(int i=0; i<10; i++)
        {
            sum+=array[i];
        }
        System.out.println("Сумма - "+sum+", среднее значение - "+sum/10);
    }
}
