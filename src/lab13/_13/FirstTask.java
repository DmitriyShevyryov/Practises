package lab13._13;

public class FirstTask
{
    private String str;

    public FirstTask(String str)
    {
        this.str = str;
    }

    public char lastSymbol()
    {
        return this.str.charAt(str.length()-1);
    }
    public static void main(String[] args)
    {
        FirstTask obj = new FirstTask("I love Java!!!");
        System.out.println(obj.lastSymbol());
        if(obj.str.endsWith("!!!"))
            System.out.println("True");
        if(obj.str.startsWith("I love"))
            System.out.println("True");
        if(obj.str.contains("Java"))
            System.out.println("True");
        System.out.println(obj.str.indexOf("Java"));
        System.out.println(obj.str.replace('a','o'));
        System.out.println(obj.str.toLowerCase());
        System.out.println(obj.str.toUpperCase());
        System.out.println(obj.str.substring(obj.str.indexOf("Java"),obj.str.indexOf("Java")+4));
    }
}
