import java.util.Scanner;

public class PL017 {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number : ");
        n = scanner.nextInt();
        System.out.println("The reverse of the number is : " + reverseDigit(n));
    }

    public static int reverseDigit(int n) {
        int result = 0;
        while (n != 0) {
            int digit = n % 10;
            result = result * 10 + digit;
            n /= 10;
        }

        return result;
    }
}
