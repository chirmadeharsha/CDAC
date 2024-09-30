import java.util.*;

public class FirstNonRepeatedChar {
    public static Character firstNonRepeatedCharacter(String input) {
        Map<Character, Integer> charCountMap = new HashMap<>();
        
        // Count occurrences of each character
        for (char c : input.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }
        
        // Find the first character with count 1
        for (char c : input.toCharArray()) {
            if (charCountMap.get(c) == 1) {
                return c;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        String input = "aabbccddeffg";
        Character result = firstNonRepeatedCharacter(input);
        if (result != null) {
            System.out.println("First non-repeated character: " + result);
        } else {
            System.out.println("No non-repeated characters found.");
        }
    }
}
