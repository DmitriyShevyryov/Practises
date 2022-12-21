package p810;


import java.util.Scanner;

public class Reverse {

private int y = 0;

    public int razr(int x, int k)
    {
        if(x != 0)
        {
            x = (int)x/10;
            k++;
            return razr(x,k);
        }
        else
            return k;
    }
    public int func(int x, int k)
    {
        if(x != 0 )
        {
            y += Math.pow(10,k-1) * (x % 10);
            x = (int)x/10;
            k--;
            return func(x,k);
        }
        else
            return y;
    }


    public static void main(String[] args)
    {
        Reverse rev = new Reverse();
        int k = 0;
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        k = rev.razr(x,k);
        System.out.println(rev.func(x,k));



    }

}
