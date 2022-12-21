package lab10._10;

import java.util.Scanner;

public class Main
{
    private Student[] array = new Student[5];
    public void init()
    {
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<5; i++)
        {
            Student student = new Student();
            student.setSname(sc.next());
            student.setName(sc.next());
            array[i] = student;


        }
    }
}
