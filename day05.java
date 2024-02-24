import java.util.Scanner;

public class day05 {

    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number to be reversed : ");
        n = scanner.nextInt();

        System.out.println("Reversed number is : " + reverseNumber(n));

    }

    public static int reverseNumber(int n) {
        int finalValue = 0;

        while (n != 0) {
            int digit = n % 10;
            finalValue = finalValue * 10 + digit;
            n = n / 10;
        }

        return finalValue;
    }
}