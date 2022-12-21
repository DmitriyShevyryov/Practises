package InternetStore;
import java.util.Objects;
import java.util.Scanner;
import java.text.*;
import java.util.Locale;
public class InternetStore {


    public static void main(String[] args)
    {
        InternetStore store = new InternetStore();
        int k = 0;
        System.out.println("Добро пожаловать в магазин одежды! Введите логин: ");
        Scanner sc = new Scanner(System.in);
        String login = sc.next();
        System.out.println("Введите пароль: ");
        String password = sc.next();
        Consumer consumer = new Consumer();

        if(!Objects.equals(password, consumer.getPassword()))
        {
            System.out.println("Введен неверный пароль");
        }
        else
        {
            System.out.println("Выберите текущий регион: ");
            String region = sc.next();
            switch (region)
            {
                case "Russia":
                    break;
                case "China":
                    Locale.setDefault(Locale.CHINESE);
                    break;
                case "France":
                    Locale.setDefault(Locale.FRENCH);
                    break;
                case "Germany":
                    Locale.setDefault(Locale.GERMAN);
                    break;
                case "UK":
                    Locale.setDefault(Locale.UK);
                    break;
            }
            for(Catalogue catalogue: Catalogue.values())
            {
                System.out.println(catalogue);
            }
            while(k < 1) {
                System.out.print("Введите каталог: ");
                Catalogue cname = Catalogue.valueOf(sc.next());
                switch (cname) {
                    case SNEAKERS -> {
                        for (Sneakers sneakers : Sneakers.values()) {
                            System.out.println(sneakers);
                        }
                        System.out.print("Выберите товар: ");
                        String iname = sc.next();
                        Item item = new Item(iname);
                        item.setPrice(Sneakers.valueOf(iname).getPrice());
                        System.out.print("Хотите добавить этот товар в корзину? ");
                        String answer = sc.next();
                        switch (answer) {
                            case "Да":
                                consumer.getPack().add(item);
                                break;

                        }
                        break;

                    }
                    case TSHIRTS -> {
                        for (Tshirts tshirts : Tshirts.values()) {
                            System.out.println(tshirts);
                        }
                        System.out.print("Выберите товар: ");
                        String iname = sc.next();
                        Item item = new Item(iname);
                        item.setPrice(Tshirts.valueOf(iname).getPrice());
                        System.out.print("Хотите добавить этот товар в корзину? ");
                        String answer = sc.next();
                        switch (answer) {
                            case "Да":
                                consumer.getPack().add(item);
                                break;

                        }
                        break;
                    }
                    case HATS -> {
                        for (Hats hats : Hats.values()) {
                            System.out.println(hats);
                        }
                        System.out.print("Выберите товар: ");
                        String iname = sc.next();
                        Item item = new Item(iname);
                        item.setPrice(Hats.valueOf(iname).getPrice());
                        System.out.print("Хотите добавить этот товар в корзину? ");
                        String answer = sc.next();
                        switch (answer) {
                            case "Да":
                                consumer.getPack().add(item);
                                break;

                        }
                        break;
                    }
                    case JACKETS -> {
                        for (Jackets jackets : Jackets.values()) {
                            System.out.println(jackets);
                        }
                        System.out.print("Выберите товар: ");
                        String iname = sc.next();
                        Item item = new Item(iname);
                        item.setPrice(Jackets.valueOf(iname).getPrice());
                        System.out.print("Хотите добавить этот товар в корзину? ");
                        String answer = sc.next();
                        switch (answer) {
                            case "Да":
                                consumer.getPack().add(item);
                                break;

                        }
                        break;
                    }
                }
                System.out.print("Показать товары в корзине ? ");
                String answer = sc.next();
                switch (answer) {
                    case "Да":
                        consumer.showPack();
                        break;

                }
            }
        }
    }
}
