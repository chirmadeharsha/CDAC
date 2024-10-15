package assiques1;

public class assi6Q6 {

	public static void main(String[] args) {
		        int[] arr = {1, 2, 4, 5};
		        int n = arr.length + 1;

		        int totalSum = n * (n + 1) / 2;
		        int arraySum = 0;
		        for (int i : arr) {
		            arraySum += i;
		        }

		        int missingNumber = totalSum - arraySum;
		        System.out.println("Missing number: " + missingNumber);
		    }
		}

