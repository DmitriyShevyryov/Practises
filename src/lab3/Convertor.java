package lab3;
import java.util.*;
import java.util.HashMap;
public class Convertor {
    private double amount;
    private Currency users_currency;

    public Convertor(Currency users_currency, double amount)
    {
        this.users_currency = users_currency;
        this.amount = amount;
    }


    public Currency getUsers_currency() {
        return users_currency;
    }
    public void setUsers_currency(Currency users_currency) {
        this.users_currency = users_currency;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    public static void main(String [] args)
    {
        ArrayList<Currency> array = new ArrayList<Currency>();
        Currency dollar = new Currency("Dollar", 60.17);
        array.add(dollar);
        Currency euro = new Currency("Euro", 62.24);
        array.add(euro);
        Currency yuan = new Currency("Yuan", 8.55);
        array.add(yuan);
        Currency pound = new Currency("Pound", 69.13);
        array.add(pound);
        Currency ruble = new Currency("Ruble", 1);
        array.add(ruble);
        Map <String, Currency> map = new HashMap<>();
        map.put(dollar.getName(), dollar);

        Scanner sc = new Scanner(System.in);
        System.out.println("Выберите валюту для конвертации: ");
        String currency = sc.next();
        System.out.println("Введите сумму: ");
        double amount = sc.nextDouble();
        Currency user_currency = new Currency();
        for(int i=0; i < array.size(); i++)
        {
            if(currency == array.get(i).getName())
                user_currency = array.get(i);

        }
        Convertor convertor = new Convertor(user_currency,amount);
    }
}
