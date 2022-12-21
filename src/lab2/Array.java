package lab2;

import java.util.Scanner;
public class Array {
    private int array[]= new int [10];
    public void input()
    {
        Scanner sc = new Scanner(System.in);
        for(int i=0; i< 10; i++)
        {
            this.array[i] = sc.nextInt();
        }
    }
    public void show()
    {
        for(int i=0; i< 10; i++)
        {
            System.out.print(this.array[i]+" ");
        }
    }
    public void change()
    {
        for(int i=0; i<5;i++ )
        {
            int t = this.array[i];
            this.array[i] = this.array[9-i];
            this.array[9-i] = t;

        }
    }
    public static void main(String [] args)
    {
        Array test = new Array();
        test.input();
        test.change();
        test.show();



    }
}
