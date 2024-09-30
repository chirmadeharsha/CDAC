public class ArrayManipulation {
    public static int arrayManipulation(int n, int[][] queries) {
        int[] arr = new int[n + 1];
        for (int[] query : queries) {
            int start = query[0];
            int end = query[1];
            int value = query[2];
            arr[start - 1] += value;
            if (end < n) arr[end] -= value;
        }
		
        int max = 0, sum = 0;
        for (int val : arr) {
            sum += val;
            max = Math.max(max, sum);
        }
        return max;
    

    public static void main(String[] args) {
        int n = 5;
        int[][] queries = {{1, 2, 100}, {2, 5, 100}, {3, 4, 100}};
        System.out.println(arrayManipulation(n, queries));
    }
}
