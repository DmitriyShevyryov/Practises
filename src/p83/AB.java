package p83;

public class AB {
    private int a;
    private int b;

    public AB(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int output()
    {
        if( a == b)
        {
            return a;
        }
        if(a < b)
        {
            if(b-a != 1)
            {
                System.out.print(a + 1 + " ");
                a++;
                return output();
            }



        }
        else
        {
            if(a - b != 1)
            {
                System.out.print(a - 1 + " ");
                a--;
                return output();
            }
        }
        return a;
    }
    public static void main(String[] args)
    {
        AB ab = new AB(300, 211);
        ab.output();
    }
}
