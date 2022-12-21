package lab4;

import java.util.ArrayList;
public class Consumer {
    private ArrayList<Item> pack = new ArrayList<>();
    private String username;
    private String password = "12345";

    public String getPassword() {
        return password;
    }

    public Consumer() {
    }

    public ArrayList<Item> getPack() {
        return pack;
    }
    public void showPack()
    {
        for(int i=0; i< pack.size(); i++)
        {
            System.out.println(pack.get(i).toString());
        }
    }
}
