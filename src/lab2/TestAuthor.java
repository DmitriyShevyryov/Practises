package lab2;
import java.util.Scanner;
public class TestAuthor {
    public static void main(String[] args)
    {
        String m;
        Author iam = new Author("Dmitriy", "shevirev.clon@gmail.com", 'm');
        System.out.println("Имя автора - "+ iam.getName()+", почта - "+ iam.getEmail()+", пол - "+iam.getGender());
        Scanner sc = new Scanner(System.in);
        m = sc.nextLine();
        iam.setEmail(m);
        System.out.println(iam.toString());
    }
}
