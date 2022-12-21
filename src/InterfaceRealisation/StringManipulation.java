package InterfaceRealisation;

import java.util.Scanner;

public class StringManipulation implements StringMan{
    private String str;
    @Override
    public int CalcSym()
    {
        int k = 0;
        for(int i=0; i<this.str.length(); i++)
        {
            k++;
        }
        return k;
    }

    @Override
    public String OddStr()
    {
        int j = 0;
       String odd = new String();
       for(int i=1; i< this.str.length(); i += 2)
       {
           odd += str.charAt(i);
       }
       return odd;

    }

    @Override
    public String InvertStr()
    {
        String inv = new String();
        for(int i=0; i<this.str.length(); i++)
        {
           inv += str.charAt(str.length()-1-i);
        }
        return inv;
    }
    public static void main(String[] args)
    {
        StringManipulation obj = new StringManipulation();
        Scanner sc = new Scanner(System.in);
        obj.str = sc.next();
        System.out.println(obj.CalcSym());
        System.out.println(obj.InvertStr());
        System.out.println(obj.OddStr());
    }
}
