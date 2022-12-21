package lab2;

public class Card {
    private String mast;
    private String znach;



    public String getMast() {
        return mast;
    }

    public String getZnach() {
        return znach;
    }

    public void setMast(String mast) {
        this.mast = mast;
    }

    public void setZnach(int znach)
    {
        int new_znach = znach % 13;
        if((new_znach > 1) & (new_znach < 11))
        {
            this.znach = Integer.toString(new_znach + 2);
        }
        else
        {
          if(new_znach == 11)
          {
              this.znach = "J";

          }
            if(new_znach == 12)
            {
                this.znach = "Q";

            }
            if(new_znach == 0)
            {
                this.znach = "K";

            }
            if(new_znach == 1)
            {
                this.znach = "A";

            }

        }
    }

    @Override
    public String toString() {
        return "Card " +
                "mast='" + mast + '\'' +
                ", znach=" + znach ;
    }
}
