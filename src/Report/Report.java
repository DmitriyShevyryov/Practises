package Report;

import java.util.ArrayList;

public class Report {
    private ArrayList<Employee> employees = new ArrayList<Employee>();
    private int number = 0;
    public void addEmployee(Employee a)
    {
        employees.add(a);
        number++;
    }
    public void generateReport()
    {
        System.out.printf("%-20s %20s %n","Сотрудник","Зарплата");
        for(int i=0; i<number; i++)
        {
            System.out.printf("%-20s %20s %n", employees.get(i).getFullname(),String.format("%.2f",employees.get(i).getSalary()));

        }
    }
    public static void main(String[] args)
    {
        Report rep = new Report();
        Employee n1 = new Employee("First", 45325.342);
        rep.addEmployee(n1);
        Employee n2 = new Employee("Second", 65325.64326);
        rep.addEmployee(n2);
        Employee n3 = new Employee("Third", 65325.64326);
        rep.addEmployee(n3);
        rep.generateReport();

    }

}
