//2.	Declare a single-dimensional array of 5 integers inside the main method. Define a method named acceptRecord to get input from the terminal into the array and another method named printRecord to print the state of the array to the terminal.package SDA;
package SDA;
import java.util. Scanner;
public class question2 {

	public void acceptRecord(int[] arr)
	{
		System.out.println("\n updated values");
		for(int i=0;i<arr.length;i++) {
			try (Scanner sc = new Scanner(System.in)) {
				arr[i]=sc.nextInt();
			}
		}
	}
	
	public void printRecord(int[] arr)
	{
		System.out.println("updated values");
		for(int i=0;i<arr.length;i++) {
			System.out.println(""+arr[i]);
		}
	}
	
	public static void main(String[] args) {
		int arr[]=new int[5];
		question2 SDA=new question2();
			SDA.acceptRecord(arr);
			SDA.printRecord(arr);
		}
}

