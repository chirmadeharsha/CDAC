import java.util.ArrayList;
import java.util.List;

public class Employee {
    // Static fields to keep track of total employees and total salary expense
    private static int totalEmployees = 0;
    private static double totalSalaryExpense = 0;

    // Fields for individual employee details
    private int id;
    private String name;
    private double salary;

    // List to store all employee instances
    private static List<Employee> employees = new ArrayList<>();

    // Constructor for Employee class
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        totalEmployees++;
        totalSalaryExpense += salary;
        employees.add(this);
    }

    // Method to retrieve the total number of employees
    public static int getTotalEmployees() {
        return totalEmployees;
    }

    // Method to apply a percentage raise to the salary of all employees
    public static void applyRaise(double percentage) {
        for (Employee employee : employees) {
            employee.salary += employee.salary * percentage / 100;
            totalSalaryExpense += employee.salary * percentage / 100;
        }
    }

    // Method to calculate the total salary expense including any raises
    public static double calculateTotalSalaryExpense() {
        return totalSalaryExpense;
    }

    // Method to update the salary of an individual employee
    public void updateSalary(double newSalary) {
        totalSalaryExpense = totalSalaryExpense - this.salary + newSalary;
        this.salary = newSalary;
    }

    // Getter and Setter methods
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    // toString method for displaying employee details
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
