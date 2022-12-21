package lab3;

public class n33 {
    public static void main(String[] args)

    {
        int min = 10;
        int max = 99;
        int flag = 1;

        int array[] = new int[4];
        for(int i=0; i<4; i++)
        {
            array[i] =  rnd(10,99);
            System.out.print(array[i]+" ");
        }
        System.out.println();
        for(int i=0; i < 3; i++ )
        {
            if(array[i] >= array[i+1] )
                flag = 0;
        }
        if(flag == 1)
        {
            System.out.println("Последовательность строго-возрастающая");
        }
        else
        {
            System.out.println("Последовательность не строго-возрастающая");
        }
    }
    public static int rnd(int min, int max)
    {
        max -= min;
        return (int)(Math.random() * ++max) + min;
    }
}
