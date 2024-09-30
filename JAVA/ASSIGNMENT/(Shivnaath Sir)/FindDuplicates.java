import java.util.*;

public class FindDuplicates {
    public static List<Integer> findDuplicates(List<Integer> input) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();
        
        for (Integer num : input) {
            if (!set.add(num)) {
                duplicates.add(num);
            }
        }
        return new ArrayList<>(duplicates);
    }

    public static void main(String[] args) {
        List<Integer> inputList = Arrays.asList(1, 2, 3, 4, 5, 2, 6, 3, 7, 8, 1);
        List<Integer> duplicates = findDuplicates(inputList);
        System.out.println("Duplicate integers: " + duplicates);
    }
}
