package lab1;

public class lab5 {
    public static void main(String[] args)
    {
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
            if (args[i].equals("-r")) {
                System.out.println("REBOOT!");
            }
        }
    }
}
