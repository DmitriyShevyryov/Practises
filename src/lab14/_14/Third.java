package lab14._14;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Third
{
    public static void main(String[] args)
    {
        String price =" 25.98 USD  27.7 EU  50 RUB 100 RUB";

        Pattern eu=Pattern.compile("\\d+.\\d*\\sEU");
        Pattern usd=Pattern.compile("\\d+.\\d*\\sUSD");
        Pattern rub=Pattern.compile("\\d+.\\d*\\sRUB");
        Matcher m1=eu.matcher(price);
        while (m1.find())
        {
            System.out.println(m1.group());
        }
        Matcher m2=usd.matcher(price);
        while (m2.find())
        {
            System.out.println(m2.group());
        }
        Matcher m3=rub.matcher(price);
        while (m3.find())
        {
            System.out.println(m3.group());
        }
    }
}
