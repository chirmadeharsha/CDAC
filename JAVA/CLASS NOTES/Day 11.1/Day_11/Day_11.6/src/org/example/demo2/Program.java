package org.example.demo2;

abstract class A{
	public abstract void print();
}

abstract class B extends A{
	
}
class C extends A{
	@Override
	public void print() {
		System.out.println("C.print");
	}
}

abstract class D{ 
	
}
public class Program {
	public static void main1(String[] args) {

	}
}
