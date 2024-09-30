public class Q7 {
    public static void main(String[] args) {
        rpt("programming");
        rpt("hello");
    }

    public static void findRepeatedCharacters(String str) {
        boolean[] visited = new boolean[256]; 
        System.out.print("Repeated characters: ");
        
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!visited[c]) {
               
                for (int j = i + 1; j < str.length(); j++) {
                    if (str.charAt(j) == c) {
                        System.out.print(c + " ");
                        visited[c] = true;
                        break;
                    }
                }
            }
        }
        System.out.println();
    }
}
