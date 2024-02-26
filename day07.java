import java.util.Scanner;

public class day07 {

    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the 3 digit number : ");
        n = scanner.nextInt();
        scanner.close();
        System.out.println(armStrongNumber(n));
    }

    public static String armStrongNumber(int n) {

        int digit3 = n % 10;
        int digit2 = (n / 10) % 10;
        int digit1 = ((n / 10) / 10) % 10;

        int armStrongNumber = (int) (Math.pow(digit1, 3) + Math.pow(digit2, 3) + Math.pow(digit3, 3));

        if (n == armStrongNumber) {
            return "Yes";
        }

        return "No";
    }

}