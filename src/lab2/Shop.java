package lab2;

import java.util.ArrayList;
import java.util.Scanner;

public class Shop {
private  ArrayList<Computer> array = new ArrayList<>();
private int number = 0;

public void addComputer(Computer computer)
{
    this.array.add(computer);
    number++;

}
public void deleteComputer(String name, String processor, String memory)
{
    Computer computer = this.searching(name,processor,memory);
    this.array.remove(computer);
    this.number--;
}
public Computer searching(String name,String processor,String capacity)
{
    for(int i=0; i<this.array.size(); i++)
    {
        if((this.array.get(i).getName() == name) & (this.array.get(i).getProcessor() == processor) & (this.array.get(i).getCapacity() == capacity))
        {
            return this.array.get(i);
        }
    }
    return null;
}
public static void main(String [] args)
{
    Shop shop = new Shop();
    Scanner sc = new Scanner(System.in);
    int k=0;
    while(k < 1)
    {
    System.out.println("Введите + если хотите добавить новый компьютер, - если хотите удалить компьютер,? - если хотите найти компьютер, -> если хотите показать все компьютеры на складе");
    String command = sc.next();

    switch (command) {
        case "+": {
            System.out.println(" Введите параметры нового компьютера - ");
            System.out.println("Фирма - ");
            String name = sc.next();
            System.out.println("Процессор - ");
            String processor = sc.next();
            System.out.println("Объем памяти - ");
            String capacity = sc.next();

            Computer computer = new Computer(name, processor, capacity);
            shop.addComputer(computer);
            break;
        }
        case "-": {
            System.out.println(" Введите параметры удаляемого компьютера - ");
            System.out.println("Фирма - ");
            String name = sc.next();
            System.out.println("Процессор - ");
            String processor = sc.next();
            System.out.println("Объем памяти - ");
            String capacity = sc.next();
            shop.deleteComputer(name, processor, capacity);
            break;
        }
        case "?": {
            System.out.println(" Введите параметры нужного компьютера - ");
            System.out.println("Фирма - ");
            String name = sc.next();
            System.out.println("Процессор - ");
            String processor = sc.next();
            System.out.println("Объем памяти - ");
            String capacity = sc.next();
            shop.searching(name, processor, capacity).toString();
            break;
        }
        case "->": {
            for (int i = 0; i < shop.number; i++) {
                System.out.println(shop.array.get(i).toString());
            }
            break;
        }
    }
    }





}


}
