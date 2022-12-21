package lab14._14;
import java.util.regex.Pattern;
public class Sixth {
    public static void main(String[] args)
    {
        var test = Pattern.compile("\\w+@(([a-zA-Z]+[^com|ru][^\\.]$)|([a-zA-Z]+[^com|ru]\\.(com|ru)$))").matcher("usermail@mail.com");
        if(test.find())
            System.out.println("Выражение подходит");
        else System.out.println("Выражение не подходит");
    }
}
