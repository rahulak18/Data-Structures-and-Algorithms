import java.util.Scanner;

public class PL020 {
    public static void main(String[] args) {
        int a, b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number a : ");
        a = scanner.nextInt();
        System.out.println("Enter the number b : ");
        b = scanner.nextInt();
        scanner.close();

        System.out.println("Gcd of the given number is " + gcdOfTwoNumbers(a, b));

    }

    public static int gcdOfTwoNumbers(int a, int b) {
        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }

        return a;
    }
}
