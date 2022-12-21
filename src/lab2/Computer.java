package lab2;

public class Computer {
    private String name;
    private String processor;
    private String capacity;

    public String getName() {
        return name;
    }

    public String getProcessor() {
        return processor;
    }

    public String getCapacity() {
        return capacity;
    }

    public Computer(String name, String processor, String capacity  )
    {
        this.name = name;
        this.capacity = capacity;
        this.processor = processor;
    }



    public Computer() {
    }

    @Override
    public String toString() {
        return "Computer{" +
                "name='" + name + '\'' +
                ", processor='" + processor + '\'' +
                ", capacity='" + capacity + '\'' +

                '}';
    }
}
