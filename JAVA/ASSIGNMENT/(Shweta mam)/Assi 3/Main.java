
class Employee {
   
    private int id;
    private String name;
    private double salary;

  
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

 
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

   
    public void setSalary(double salary) {
        this.salary = salary;
    }

   
    public void applyRaise(double percentage) {
        this.salary += this.salary * (percentage / 100);
    }

   
    public void updateSalary(double newSalary) {
        this.salary = newSalary;
    }

    
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}


public class Main {
    public static void main(String[] args) {
       
        Employee employee1 = new Employee(1, "John Doe", 50000);

    
        System.out.println(employee1);

     
        System.out.println("Employee ID: " + employee1.getId());
        System.out.println("Employee Name: " + employee1.getName());
        System.out.println("Employee Salary: " + employee1.getSalary());

       
        employee1.applyRaise(10);
        System.out.println("Salary after 10% raise: " + employee1.getSalary());

     
        employee1.updateSalary(60000);
        System.out.println("Updated Salary: " + employee1.getSalary());

     
        employee1.setName("Jane Smith");
        System.out.println("Updated Employee Name: " + employee1.getName());

     
        System.out.println(employee1);
    }
}
