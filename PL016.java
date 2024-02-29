import java.util.Scanner;

public class PL016 {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to validate it is palindrome or not");
        n = scanner.nextInt();

        if (n == reverseNumber(n)) {
            System.out.println("Yes it is a palindrome number");
        } else {
            System.out.println("No it is not a palindrome number");
        }
        scanner.close();
    }

    public static int reverseNumber(int n) {
        int result = 0;
        while (n != 0) {
            int digit = n % 10;
            result = result * 10 + digit;
            n /= 10;
        }

        return result;
    }
}
