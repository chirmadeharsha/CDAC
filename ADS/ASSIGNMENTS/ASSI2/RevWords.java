public class RevWords {
    public static void main(String[] args) {
        String input = "Hello World";
        String[] words = input.split(" ");
        StringBuilder reversed = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]).append(" ");
        }
        System.out.println(reversed.toString().trim());
    }
}
