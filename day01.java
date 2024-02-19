import java.util.Scanner;

public class day01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = scanner.nextInt();
        System.out.println("The sum of the series is : " + sumSeries(n));
        scanner.close();
    }

    public static long sumSeries(int n) {
        return (long) (n) * (long) (n + 1) / 2;
    }
}