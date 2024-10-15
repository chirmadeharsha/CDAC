public class Q8 {
    public static void main(String[] args) {
        System.out.println("nonrepeated ch: " +NonRepeatedCharacter("stress")); 
        System.out.println("non-repeated ch: " + NonRepeatedCharacter("aabbcc"));
    }

    public static Character NonRepeatedCharacter(String str) {
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            boolean isRepeated = false;
            
            
            for (int j = 0; j < str.length(); j++) {
                if (i != j && str.charAt(j) == c) {
                    isRepeated = true;
                    break;
                }
            }
            
            if (!isRepeated) {
                return c;
            }
        }
        
        return null;
    }
}
