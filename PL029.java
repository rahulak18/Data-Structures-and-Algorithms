import java.util.Scanner;

public class PL029 {
    public static void main(String[] args) {
        int a = 9, b = 11, n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        n = scanner.nextInt();
        scanner.close();
        System.out.println("The nth term of AP series is : " + nthTermOfAP(a, b, n));
    }

    public static int nthTermOfAP(int a1, int a2, int n) {
        return (a1 + ((a2 - a1) * (n - 1)));
    }
}
