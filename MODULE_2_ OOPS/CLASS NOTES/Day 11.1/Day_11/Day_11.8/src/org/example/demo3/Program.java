package org.example.demo3;

class Employee{
	private String name;
	private int empid;
	private float salary;
	public Employee(String name, int empid, float salary) {
		this.name = name;
		this.empid = empid;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", empid=" + empid + ", salary=" + salary + "]";
	}
	
}
public class Program {
	public static void main(String[] args) {
		Employee emp1 = new Employee("Sandeep", 33, 45000.50f);
		Employee emp2 = new Employee("Sandeep", 33, 45000.50f);
		
		if( emp1 == emp2 )
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
	}
}
