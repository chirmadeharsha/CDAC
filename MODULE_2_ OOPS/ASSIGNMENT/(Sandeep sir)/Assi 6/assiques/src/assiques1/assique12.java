package assiques1;
import java.util.Scanner;
public class assique12 {

	public static void main(String[] args) {
		
		        // Declare an array of 5 integers
		        int[] arr = new int[5];

		        // Traverse the array and print the default values
		        System.out.println("Default values:");
		        for (int i = 0; i < arr.length; i++) {
		            System.out.println(arr[i]);
		        }

		        // Accept records from the user
		        Scanner scanner = new Scanner(System.in);
		        System.out.println("Enter 5 integers:");
		        for (int i = 0; i < arr.length; i++) {
		            arr[i] = scanner.nextInt();
		        }

		        // Print the updated values
		        System.out.println("Updated values:");
		        for (int i = 0; i < arr.length; i++) {
		            System.out.println(arr[i]);
		        }
		    }
		}

