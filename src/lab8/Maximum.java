package lab8;

import java.util.Scanner;

public class Maximum {
    int max = 0;
    public int find()
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if(x == 0)
        {
            return 0;
        }
        else
        {
            return Math.max(x,find());
        }

    }
    public static void main(String[] args)
    {
        Maximum m = new Maximum();
        System.out.println(m.find());
    }
}
