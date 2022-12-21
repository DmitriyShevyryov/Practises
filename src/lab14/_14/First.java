package lab14._14;
import java.util.regex.Pattern;
public class First
{
    public static void main(String[] args)
    {
        Pattern p3 = Pattern.compile("\\d+\\s?");
        String[] words = p3.split("dog53 cat 43mouse");
        for (String word : words)
            System.out.println(word);
    }
}
