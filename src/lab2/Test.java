package lab2;

import lab2.Book;
import lab2.Shelf;

public class Test {
    public static void main(String [] args)
    {
        Shelf shelf = new Shelf();
        Book first = new Book("Name","Author",1984);
        Book second = new Book("NAME","AUTHOR",1990);
        Book third = new Book("B","Freddy",1923);
        shelf.setArray(shelf.add(first));
        shelf.setArray(shelf.add(second));
        shelf.setArray(shelf.add(third));
        shelf.show();
        System.out.println("Самая древняя - "+shelf.earliest().getName());
        System.out.println("Самая молодая - "+shelf.latest().getName());
        shelf.sort();
        shelf.show();
    }
}
