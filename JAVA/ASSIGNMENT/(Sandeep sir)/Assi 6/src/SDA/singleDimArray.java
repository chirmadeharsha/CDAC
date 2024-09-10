//1.	Declare a single-dimensional array of 5 integers inside the main method. Traverse the array to print the default values. Then accept records from the user and print the updated values of the array.

package SDA;
import java.util. Scanner;

public class singleDimArray {
	public void acceptRecord(int[] arr)
	{
		System.out.println("\n updated values");
		for(int i=0;i<arr.length;i++) {
			Scanner  sc= new Scanner(System.in);
			arr[i]=sc.nextInt();
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
		for (int i=0;i<arr.length;i++) {
			System.out.println("Default value");
			System.out.println(""+arr[i]);
				
			}
			singleDimArray SDA=new singleDimArray();
			SDA.acceptRecord(arr);
			SDA.printRecord(arr);
		}
	}
	
	
