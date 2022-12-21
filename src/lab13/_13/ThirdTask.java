package lab13._13;

public class ThirdTask
{
    private String num;
    private String name;
    private String color;
    private String size;

    public static void main(String[] args)
    {
        ThirdTask[] shirtArray = new ThirdTask[11];
        String[] shirts = new String[11];
        shirts[0] = "S001,Black Polo Shirt,Black,XL";
        shirts[1] = "S002,Black Polo Shirt,Black,L";
        shirts[2] = "S003,Blue Polo Shirt,Blue,XL";
        shirts[3] = "S004,Blue Polo Shirt,Blue,M";
        shirts[4] = "S005,Tan Polo Shirt,Tan,XL";
        shirts[5] = "S006,Black T-Shirt,Black,XL";
        shirts[6] = "S007,White T-Shirt,White,XL";
        shirts[7] = "S008,White T-Shirt,White,L";
        shirts[8] = "S009,Green T-Shirt,Green,S";
        shirts[9] = "S010,Orange T-Shirt,Orange,S";
        shirts[10] = "S011,Maroon Polo Shirt,Maroon,S";
        for(int i=0; i< shirts.length; i++)
        {
            ThirdTask newShirt = new ThirdTask();
            newShirt.num = shirts[i].split(",")[0];
            newShirt.name = shirts[i].split(",")[1];
            newShirt.color = shirts[i].split(",")[2];
            newShirt.size = shirts[i].split(",")[3];

            shirtArray[i] = newShirt;
        }
        for (int i=0; i< shirtArray.length; i++)
        {
            System.out.println(shirtArray[i].num+" "+shirtArray[i].name+" "+shirtArray[i].color+" "+shirtArray[i].size);
        }


    }
}
