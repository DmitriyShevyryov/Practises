package lab2;

public class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setAge(int age)
    {
        this.age = age;
    }
    public int age_to_human()
    {
        return 7*age;
    }

    @Override
    public String toString() {
        return "Dog " +
                "name = '" + name + '\'' +
                ", age = " + age +"(human "+ this.age_to_human()+")";
    }
}
