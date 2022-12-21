package lab14._14;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Four {
    public static void main(String[] args) {
        Pattern p4 = Pattern.compile("\\+\\d");
        Matcher m4 = p4.matcher("(1-8)–9/4");
        boolean b = m4.matches();


        while (m4.find())
        {
            System.out.println("(1+8)–9/4: " + m4.group());
        }
    }

}
