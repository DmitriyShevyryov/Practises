package n42;

import java.util.ArrayList;
import java.util.Arrays;

public class Test extends Phone {
    public ArrayList<String> contacts = new ArrayList<>();
    public void sendMessage( String... numbers)
    {
        for(int i=0; i< numbers.length;i++)
        {
            System.out.println(numbers[i]);
        }

    }
    @Override
    public  void receiveCall( String name)
    {
        super.receiveCall(name);
        System.out.println( "номер: "+this.number);
    }
    public static void main(String [] args)
    {
        Test test = new Test();
        Phone first = new Phone("89105028494","11");
        Phone second = new Phone("89999999999","s5");
        Phone third = new Phone("89999999499","s4");
        test.contacts.add(first.getNumber());
        test.contacts.add(second.getNumber());
        test.contacts.add(third.getNumber());
        first.receiveCall("Dmitriy");
        System.out.println(first.getNumber());
        second.receiveCall("Ivan");
        System.out.println(second.getNumber());
        third.receiveCall("Rasul");
        System.out.println(third.getNumber());
        Phone fourth = new Phone("87629987273","13", 100);
        test.contacts.add(fourth.getNumber());
        fourth.receiveCall("Mike");
        test.sendMessage(first.getNumber(),second.getNumber(),third.getNumber(),fourth.getNumber());




    }

}

