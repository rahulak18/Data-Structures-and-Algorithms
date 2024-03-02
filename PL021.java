import java.util.Scanner;

public class PL021 {
    public static void main(String[] args) {
        int n = 7;
        int key;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the key index : range(0 - " + (n - 1) + ") : ");
        key = scanner.nextInt();
        scanner.close();
        int[] arr = { 1, 2, 4, 5, 6, 7, 8 };

        if (key <= n - 1) {
            System.out.println("Element present at index " + key + " is : " + arr[key]);
        } else {
            System.out.println("Key is out of bound");
        }
    }
}
