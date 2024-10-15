public class RmvDuplicates {
    public static int removeDuplicates(int[] arr) {
        if (arr.length == 0) return 0;

        int uniqueIndex = 1; 

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                arr[uniqueIndex] = arr[i];
                uniqueIndex++;
            }
        }

        return uniqueIndex; 
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 1, 2};
        System.out.println("New length: " + removeDuplicates(arr1)); 

        int[] arr2 = {0, 0, 1, 1, 2, 2, 3, 3};
        System.out.println("New length: " + removeDuplicates(arr2)); 
    }
}
