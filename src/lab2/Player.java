package lab2;

import lab2.Card;

public class Player {
    private Card[] cards = new Card[5];
    private int num = 1;

    public Card[] getCards() {
        return cards;
    }
    public void anotherCard(Card card)
    {
        if(num == 1)
        {
            cards[0] = card;
            num++;
        }
        else {
            cards[num-1] = card;
            num++;
        }
    }
}
