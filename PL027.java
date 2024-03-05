import java.util.Scanner;

public class PL027 {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number : ");
        n = scanner.nextInt();
        scanner.close();
        System.out.println("The number is : " + oddOrEven(n));
    }

    public static String oddOrEven(int n) {
        if (n % 2 == 0) {
            return "Even";
        }

        return "Odd";
    }
}
