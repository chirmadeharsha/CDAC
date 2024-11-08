package org.example.main;

class Base{
	public void print( ) {
	}
}

class Derived extends Base{
	@Override
	public void print() throws RuntimeException {
		try {
			for( int count = 1; count <= 10; ++ count ) {
				System.out.println("Count	:	"+count);
				if( count == 5)
					throw new InterruptedException();
				Thread.sleep(250);
			}
		} catch (InterruptedException cause) {
			throw new RuntimeException(cause);	//Exception Chaining
		}
	}
}

public class Program {
	public static void main(String[] args) {
		try {
			Base base = new Derived( );	//Upcasting
			
			base.print();	//Dynamic Method Dispatch
		} catch (RuntimeException e) {
			Throwable cause = e.getCause();
			System.out.println(cause);
		}
	}
}
