package n31;
import java.util.Random;
import java.util.Arrays;
public class RandomArray {
    private double[] array = new double[10];
    public void show(double[] array)
    {
        for(int i=0; i< 10; i++)
        {
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }

    public double[] getArray() {
        return array;
    }

    public static void main(String [] args)
    {
        RandomArray obj = new RandomArray();
        System.out.println("Класс Math:");
        for(int i=0; i< 10; i++)
        {
            obj.array[i] = Math.random()*100;
        }
        obj.show(obj.array);
        Arrays.sort(obj.array);
        obj.show(obj.array);
        System.out.println("Класс Random:");
        Random rand = new Random();
        for(int i=0; i< 10; i++)
        {
            obj.array[i] = rand.nextDouble()*100;
        }
        obj.show(obj.array);
        Arrays.sort(obj.array);
        obj.show(obj.array);







    }
}
