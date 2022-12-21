package lab13._13;

public class FourthTask {
    private String number;

    public FourthTask(String number)
    {
        this.number = number;
    }

    public String newNumber()
    {
        if (number.charAt(0) != '8')
        {
            String three1 = this.number.substring(2, 5);
            String three2 = this.number.substring(5, 8);
            String four = this.number.substring(8, 12);

            char code = this.number.charAt(1);
            return new StringBuffer().append("+").append(code).append(three1).append("-").append(three2).append("-").append(four).toString();
        }
        else
        {
            String three1 = this.number.substring(1, 4);
            String three2 = this.number.substring(4, 7);
            String four = this.number.substring(7, 11);
            return new StringBuffer().append("+7").append(three1).append("-").append(three2).append("-").append(four).toString();
        }
    }
    public static void main(String[] args)
    {
        FourthTask number = new FourthTask("89105028494");
        System.out.println(number.newNumber());


    }
}
