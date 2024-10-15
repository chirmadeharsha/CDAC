import java.util.Scanner;

public class ArmstrongNumberSimple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int originalNum = num;
        int result = 0;

        while (num != 0) {
            int digit = num % 10;
            result += digit * digit * digit;
            num /= 10;
        }

        if (result == originalNum) {
            System.out.println("It is an Armstrong number.");
        } else {
            System.out.println("It is not an Armstrong number.");
        }
    }
}
