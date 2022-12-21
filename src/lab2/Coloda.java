package lab2;
import lab2.Card;

import java.util.ArrayList;
import java.util.Collections;
public class Coloda {
    private ArrayList<Card> col = new ArrayList<Card>();
    private int num;

    public void create()
    {
        for(int i=0; i< 52;i++)
        {
            Card card = new Card();
            int k = i;
            if(  k<13)
            {
                card.setMast("B");
                card.setZnach(k);
            }
            if((k>12) & (k<26))
            {
                card.setMast("K");
                card.setZnach(k);

            }
            if((k>25) & (k<39))
            {
                card.setMast("CH");
                card.setZnach(k);

            }
            if((k>38) & (k<52))
            {
                card.setMast("P");
                card.setZnach(k);

            }
            col.add(card);
        }
        Collections.shuffle(col);

    }

    public ArrayList<Card> getCol() {
        return col;
    }
}
