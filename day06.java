import java.util.Scanner;

public class day06 {

    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number : ");
        n = scanner.nextInt();

        printPattern(n);
        scanner.close();
    }

    public static void printPattern(int n) {
        for (int i = n; i > 0; i--) {
            for (int j = n; j > 0; j--) {
                for (int k = i; k > 0; k--) {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }

}