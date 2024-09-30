public class RevNumber {
    public static void main(String[] args) {
        int number = 1234;
        int reversed = 0;
        int temp = Math.abs(number);
        while (temp > 0) {
            reversed = reversed * 10 + temp % 10;
            temp /= 10;
        }
        reversed = (number < 0) ? -reversed : reversed;
        System.out.println(reversed);
    }
}
