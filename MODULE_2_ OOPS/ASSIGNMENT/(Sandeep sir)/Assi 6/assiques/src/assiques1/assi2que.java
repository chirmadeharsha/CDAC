package assiques1;
import java.util.Scanner;
public class assi2que {

	public static void main(String[] args) {
		        int[] arr = new int[5];
		        acceptRecord(arr);
		        printRecord(arr);
		    }
		    public static void acceptRecord(int[] arr) {
		        Scanner scanner = new Scanner(System.in);
		        System.out.println("Enter 5 integers:");
		        for (int i = 0; i < arr.length; i++) {
		            arr[i] = scanner.nextInt();
		        }
		    }

		    public static void printRecord(int[] arr) {
		        System.out.println("Array values:");
		        for (int i : arr) {
		            System.out.println(i);
		        }
		    }
		}


