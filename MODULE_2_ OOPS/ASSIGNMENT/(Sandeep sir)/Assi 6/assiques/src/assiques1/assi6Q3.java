package assiques1;

public class assi6Q3 {

	public static void main(String[] args) {
		        int[] arr = {3, 5, 1, 9, 2};

		        int max = arr[0];
		        int min = arr[0];

		        for (int i = 1; i < arr.length; i++) {
		            if (arr[i] > max) {
		                max = arr[i];
		            }
		            if (arr[i] < min) {
		                min = arr[i];
		            }
		        }

		        System.out.println("Maximum value: " + max);
		        System.out.println("Minimum value: " + min);
		    }
		}
