public class Rem {
    public static String removeSpaces(String str) {
        return str.replaceAll("\\s+", ""); 
    }

    public static void main(String[] args) {
        String str1 = "Hello World";
        System.out.println(removeSpaces(str1)); 

        String str2 = "  Java   Programming  ";
        System.out.println(removeSpaces(str2)); 
    }
}
