package com.cdac.genric;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Student implements Comparable<Student>
{
	int RollNo;
	String Name;
	int Age;
	float Fees;
	
	public Student() {
		super();
	}

	public Student(int rollNo, String name, int age, float fees) {
		super();
		RollNo = rollNo;
		Name = name;
		Age = age;
		Fees = fees;
	}

	@Override
	public String toString() {
		return "RollNo=" + RollNo + ", Name=" + Name + ", Age=" + Age + ", Fees=" + Fees;
	}

	void ShowRecord()
	{
		System.out.println("Roll No:"+this.RollNo+ " Name: "+this.Name);
	}

	@Override
	public int compareTo(Student o) {
		return this.Name.compareTo(o.Name);
	}
}

class AgeComparator implements Comparator<Student>
{

	@Override
	public int compare(Student o1, Student o2) {
		
		if(o1.Age>o2.Age)
		{
			return 1;
		}
		if(o1.Age<o2.Age)
		{
			return -1;
		}		
		return 0;
	}
	
}


class Demo<T> //<> is know daimond operator used to indicate generic type
{
	T Var1;   //A variable declared using T is known as Generic variable
	T Var2;
	
	void ShowRecord()
	{
		System.out.println(this.Var1+" "+this.Var2);
	}
	/*
	static void GetData(T a, T b)  //Generic Method
	{
		
	}
	*/
}

class StudentManager
{
	ArrayList<Student> slist=new ArrayList<Student>();
	
	public StudentManager() {
		Student s1=new Student(101,"Malkeet",34,5678.89f);
		slist.add(s1);
		slist.add(new Student(103, "Sham", 21, 789967.90f));
		slist.add(new Student(102, "Ritesh", 21, 9967.90f));
		slist.add(new Student(105, "Akhsit", 56, 1789967.90f));
		slist.add(new Student(104, "Zeenat", 8, 89967.90f));
	}
	
	void AddStudent()
	{
		Scanner sc=new Scanner(System.in);
		Student s=new Student();
		System.out.println("Enter Roll No:");
		s.RollNo=sc.nextInt();
		System.out.println("Enter Name: ");
		s.Name=sc.next();
		System.out.println("Enter Age: ");
		s.Age=sc.nextInt();
		System.out.println("Enter Fees: ");
		s.Fees=sc.nextFloat();
		slist.add(s);
		System.out.println("Student Added Successfully");
	}
	
	void UpdateStudent()
	{
		boolean flag=false;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Roll No of the Student to be Updated: ");
		int rn=sc.nextInt();
		
		
		for(Student s:slist)
		{
			if(s.RollNo==rn)
			{
				flag=true;
				System.out.println("Enter new Name: ");
				s.Name=sc.next();
				System.out.println("Enter new Age: ");
				s.Age=sc.nextInt();
				System.out.println("Enter new Fees: ");
				s.Fees=sc.nextFloat();
				System.out.println("Student Updated Successfully");
				break;
			}
			
		}
		if(flag==false)
		{
			System.out.println("Student Not Found");
		}
		
	}
	void DeleteStudent()
	{
		boolean flag=false;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Roll No of the Student to be Deleted: ");
		int rn=sc.nextInt();
		
		for(Student s:slist)
		{
			if(s.RollNo==rn)
			{
				flag=true;
				slist.remove(s);
				System.out.println("Student Deleted Successfully");
				break;
			}
		}
		if(flag==false)
		{
			System.out.println("Student Not Found");
		}
	}
	void PrintAllStudent()
	{
		//System.out.println(slist);
		
		for(Student s:slist)
		{
			//System.out.println("Roll No: "+s.RollNo+" Name: "+s.Name);
			System.out.println(s);
		}
	}
	void PrintAllSortedByName()
	{
		Collections.sort(slist);
		PrintAllStudent();
	}
	void PrintAllSortedByAge()
	{
		
		Collections.sort(slist, new AgeComparator());
		PrintAllStudent();
	}
	void PrintAllSortedByRollNo()
	{
		
		Comparator<Student> srn=new Comparator<Student>() {
			
			@Override
			public int compare(Student o1, Student o2) {
				if(o1.Age>o2.Age)
				{
					return 1;
				}
				if(o1.Age<o2.Age)
				{
					return -1;
				}					return 0;
			}
		};
		Collections.sort(slist, srn);
		PrintAllStudent();
	}
	void PrintAllSortedByName2()
	{
		
		Collections.sort(slist, (s1,s2)->s1.Name.compareTo(s2.Name));
		PrintAllStudent();
	}
	void PrintAllSortedByNameByAge()
	{
		
		slist.stream().filter(s->s.Age>50).forEach(s->System.out.println(s));//
	}
	
	
	
}

public class GenericDemo {
	
	public static void main(String[] args) {
		StudentManager sm=new StudentManager();
		
		//sm.PrintAllStudent();
		//sm.AddStudent();
		//sm.PrintAllStudent();
		
		int choice;
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.println("------------Student Manager App----");
			System.out.println("Press 1 to Add Student");
			System.out.println("Press 2 to View all Studens");
			System.out.println("Press 3 to Update Student");
			System.out.println("Press 4 to Delete Student");
			System.out.println("Press 5 to Sorted By Name");
			System.out.println("Press 6 to Sorted By Age");
			System.out.println("Press 7 to Exit");
			System.out.println("-----------------------------------");
			System.out.println("Enter Your Choice");
			choice=sc.nextInt();
			
			switch (choice) {
			case 1:
				sm.AddStudent();
				break;
			case 2:
				sm.PrintAllStudent();
				break;
			case 3:
				sm.UpdateStudent();
				break;
			case 4:
				sm.DeleteStudent();
				break;
			case 5:
				sm.PrintAllSortedByName();
				break;
			case 6:
				sm.PrintAllSortedByAge();
				break;
			case 7:
				System.out.println("Exiting Program");
				break;
			default:
				System.out.println("Invalid Inout");
				break;
			}
		}while(choice!=7);
		
	}
	
	public static void main4(String[] args) {
		
		
		ArrayList<Student> slist=new ArrayList<Student>();
		
		Student s1=new Student(101,"Malkeet",34,3456.89f);
		
		slist.add(s1);
		slist.add(new Student(102, "Sandeep", 36, 456.89f));
		
		
		ArrayList<Integer> in=new ArrayList<>();
		
		in.add(105);
		in.add(1105);
		in.add(15);
		in.add(5);
		
		Collections.sort(in);
		//Collections.sor
		
	}
	
	public static void main3(String[] args) {
		
		Student s1=new Student();
		
		
		
		
		Student[] arr=new Student[100];
		
		arr[0]=new Student();
		
		for(int i=0;i<100;i++)
		{
			float sum=0;
			sum=sum+arr[i].Fees;
		}
	}
	
	public static void main2(String[] args) {
		
		Demo d1=new Demo();   //Raw Type
		
		d1.Var1="Malkeet";
		d1.Var2="Singh";
		
		//d1.Var1=new ArrayList<>();
		
		Demo d2=new Demo();
		d2.Var1=10889;
		d2.Var2=78906;
		d1.ShowRecord();
		d2.ShowRecord();
		
		Demo d3=new Demo();
		
		d3.Var1="Sham";
		d3.Var2=890.89f;
		d3.ShowRecord();
		
		Demo<Float> d4=new Demo<Float>();  //Bounded Instance of Demo class
		d4.Var1=4567.89f;
		d4.Var2=78890.90f;
		d4.ShowRecord();
	}

	public static void main1(String[] args) {
		
		Student s1=new Student();
		s1.Name="Malkeet";
		s1.RollNo=1001;
		
		Student s2=new Student();
		s2.Name="Sham";
		s2.RollNo=1002;
		
		//s1.RollNo=567.89f;
		

	}

}
