package Obolochka;

public class Obolochka {
    public static void main(String[] args)
    {
        Double d = Double.valueOf("1567");
        Double c = Double.parseDouble("34327");
        Double sum = c + d;
        int r1 = sum.intValue();
        System.out.println(r1);
        long r2 = sum.longValue();
        System.out.println(r2);
        short r3 = sum.shortValue();
        System.out.println(r3);
        byte r4 = sum.byteValue();
        System.out.println(r4);
        boolean r5 = sum.describeConstable().isPresent();
        System.out.println(r5);
        String s = Double.toString(4325);
        System.out.println(s);





    }
}
