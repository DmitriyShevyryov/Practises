package lab14._14;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Second
{
    public static void main(String[] args)
    {
        Pattern p2 = Pattern.compile("abcdefghijklmnopqrstuv18340");
        Matcher m = p2.matcher( "abcdefghijklmnopqrstuv18340" );
        boolean b = m.matches();
        System.out.println(b);
    }
}
