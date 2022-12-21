package lab4;

import lab4.Contacts;

public class Phone extends Contacts {
    public String number;
    private String model;
    private int weight;
    public void receiveCall(String name)
    {
        System.out.println("Звонит "+ name );
    }


    public String getNumber() {
        return number;
    }

    public Phone(String number, String model, int weight) {
        this(number,model);
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
    }

    public void receiveCall() {
    }

}
