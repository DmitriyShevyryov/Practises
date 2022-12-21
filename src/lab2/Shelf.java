package lab2;

import lab2.Book;

public class Shelf {
    private Book[] array = new Book[1];
    private int num=1;

    public Book[] getArray() {
        return array;
    }

    public void setArray(Book[] array) {
        this.array = array;
    }

    public int getNum() {
        return num;
    }
    public Book[] add(Book book)
    {
        if(num == 1){
            array[0] = book;
            num++;
            return array;
        }
        else {
            Book[] new_array = new Book[array.length + 1];
            for (int i = 0; i < array.length; i++)
            {
                new_array[i] = array[i];

            }
            new_array[new_array.length-1] = book;
            num++;
            return new_array;
        }
    }
    public void show()
    {
        for(int i=0; i< num-1; i++)
        {
            System.out.println(array[i].getName()+"  "+array[i].getAuthor()+"  "+array[i].getYear());
        }
    }
    public Book earliest()
    {
        int min = 10000;
        Book earliest = new Book();
        for(int i=0; i<num-1; i++)
        {
            if(array[i].getYear()<min)
            {
                min =array[i].getYear();
                earliest = array[i];
            }
        }
        return earliest;
    }
    public Book latest()
    {
        int max = -10000;
        Book latest = new Book();
        for(int i=0; i<num-1; i++)
        {
            if(array[i].getYear()>max)
            {
                max =array[i].getYear();
                latest = array[i];
            }
        }
        return latest;
    }
    public void sort()
    {
        int min = 10000;
        Book temp;
        Book earliest = array[0];
        int k = 0;
        while( k < num-1) {
            for (int i = k; i < num - 1; i++) {
                if (array[i].getYear() < min) {
                    min = array[i].getYear();
                    earliest = array[i];
                }

            }
            temp = array[k];
            array[k] = earliest;
            earliest = temp;
            k++;
        }
    }


}
