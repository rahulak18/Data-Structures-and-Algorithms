import java.util.Scanner;

public class day04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.print("Enter the number : ");
        n = scanner.nextInt();

        printNumber(n);
    }

    public static void printNumber(int n) {
        if (n == 0) {
            return;
        }

        printNumber(n - 1);
        System.out.print(n + " ");
    }

}