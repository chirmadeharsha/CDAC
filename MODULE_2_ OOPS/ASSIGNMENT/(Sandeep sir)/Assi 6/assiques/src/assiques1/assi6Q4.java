package assiques1;
import java.util.Arrays;
public class assi6Q4 {
	public static void main(String[] args) {
		        int[] arr = {1, 2, 3, 2, 4, 3, 5};
		        Arrays.sort(arr);

		        int[] uniqueArray = new int[arr.length];
		        int j = 0;

		        for (int i = 0; i < arr.length - 1; i++) {
		            if (arr[i] != arr[i + 1]) {
		                uniqueArray[j++] = arr[i];
		            }
		        }
		        uniqueArray[j++] = arr[arr.length - 1];

		        System.out.println("Array without duplicates:");
		        for (int i = 0; i < j; i++) {
		            System.out.println(uniqueArray[i]);
		        }
		    }
		}


	
