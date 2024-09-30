public class RevString {
    public static String reverse(String str) {
        StringBuilder reversed = new StringBuilder(str);
        return reversed.reverse().toString();
    }

    public static void main(String[] args) {
        String str1 = "hello";
        System.out.println(reverse(str1)); 

        String str2 = "Java";
        System.out.println(reverse(str2)); 
    }
}
