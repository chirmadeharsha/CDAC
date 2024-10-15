package assiques1;
import java.util.HashSet;
public class assi6Q5 {

	public static void main(String[] args) {
		        int[] arr1 = {1, 2, 3, 4, 5};
		        int[] arr2 = {4, 5, 6, 7, 8};

		        HashSet<Integer> set1 = new HashSet<>();
		        for (int i : arr1) {
		            set1.add(i);
		        }

		        System.out.println("Intersection of two arrays:");
		        for (int i : arr2) {
		            if (set1.contains(i)) {
		                System.out.println(i);
		            }
		        }
		    }
		}


