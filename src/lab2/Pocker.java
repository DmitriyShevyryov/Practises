package lab2;

import java.util.Scanner;

public class Pocker {
    private Player[] players = new Player[100];
    private int num;
    public void setPlayers(int n, Coloda coloda)
    {
        int k = 0;
        for(int i=0; i<n;i++)
        {
            Player player = new Player();
            for(int j=0; j<5; j++)
            {
                player.anotherCard(coloda.getCol().get(k));
                k++;
            }
            players[i] = player;


        }
        num = n;
    }
    public void showCards()
    {
        for(int i=0; i<num; i++)
        {
            System.out.println("Карты игрока "+(i+1)+": ");
            for(int j=0; j < 5; j++)
            {
                System.out.println(players[i].getCards()[j].toString());
            }
        }
    }

    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        Pocker game = new Pocker();
        Coloda coloda = new Coloda();
        coloda.create();
        System.out.println("Введите количество игроков: ");
        int n = sc.nextInt();
        game.setPlayers(n,coloda);
        game.showCards();
    }
}
