package lab13._13;

public class SecondTask {
    private String surname;
    private String name;
    private String otch;

    public SecondTask(String surname, String name, String otch)
    {
        this.surname = surname;
        this.name = name;
        this.otch = otch;
    }

    public String getInit()
    {
        String n;
        String o;
        if(this.name.length() > 1)
            n = new StringBuffer().append(this.name.charAt(0)).append('.').toString();
        else
            n = "";
        if(this.otch.length() > 1)
            o = new StringBuffer().append(this.otch.charAt(0)).append('.').toString();
        else
            o = "";
        return new StringBuffer().append(surname).append(" ").append(n).append(o).toString();

    }
    public static void main(String[] args)
    {
        SecondTask person = new SecondTask("Шевырев",  "Дмитрий","Михайлович");
        System.out.println(person.getInit());

    }
}
