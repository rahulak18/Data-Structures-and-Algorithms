import java.util.Scanner;

public class PL026 {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        n = scanner.nextInt();
        scanner.close();
        int sumOfDigits = digitSum(n);
        if (sumOfDigits == reverseNum(sumOfDigits)) {
            System.out.println("The sum of the digits is palindrome");
        } else {
            System.out.println("The sum of the digits is not a palindrome");
        }
    }

    public static int reverseNum(int n) {
        int result = 0;
        while (n != 0) {
            int digit = n % 10;
            result = result * 10 + digit;
            n /= 10;
        }

        return result;
    }

    public static int digitSum(int n) {
        int result = 0;
        while (n != 0) {
            int digit = n % 10;
            result = result + digit;
            n /= 10;
        }

        return result;
    }
}
