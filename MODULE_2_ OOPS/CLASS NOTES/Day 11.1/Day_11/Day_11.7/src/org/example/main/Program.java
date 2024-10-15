package org.example.main;

import java.util.Scanner;

abstract class Shape{
	protected float area;
	public Shape() {
	}
	
	public abstract void acceptRecord( Scanner sc );
	
	public abstract void calculateArea();
	
	public final void printRecord( ) {
		System.out.println("Area	:	"+this.area);
	}
}
class Rectangle extends Shape{
	private float length;
	private float breadth;
	public Rectangle() {
	}
	public void acceptRecord( Scanner sc ) {
		System.out.print("Length	:	");
		this.length = sc.nextFloat();
		System.out.print("Breadth	:	");
		this.breadth = sc.nextFloat();
	}
	public void calculateArea() {
		this.area = this.length * this.breadth;
	}
}
class Circle extends Shape{
	private float radius;
	public Circle() {
	}
	public void acceptRecord( Scanner sc ) {
		System.out.print("Radius	:	");
		this.radius = sc.nextFloat();
	}
	public void calculateArea( ) {
		this.area = (float) (Math.PI * Math.pow(radius, 2));
	}
}
public class Program {
	private static Scanner sc = new Scanner(System.in);
	public static int menuList( ) {
		System.out.println("0.Exit");
		System.out.println("1.Rectangle");
		System.out.println("2.Circle");
		System.out.print("Enter choice	:	");
		return sc.nextInt();
	}
	public static void main(String[] args) {
		int choice;
		while( ( choice = Program.menuList( ) ) != 0 ) {
			Shape shape = null;
			switch( choice ) {
			case 1:
				shape = new Rectangle();	//Upcasting
				break;
			case 2:
				shape = new Circle();	//Upcasting
				break;
			}
			if( shape != null ) {
				shape.acceptRecord( sc );	//Dynamic method dispatch
				shape.calculateArea( );		//Dynamic method dispatch
				shape.printRecord();
			}
		}
	}
}
