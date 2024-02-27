import java.util.Scanner;

public class day08a {

    public static void main(String[] args) {
        int length = 5;
        int[] arr = { 1, 23, 34, 54, 65 };
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number : ");
        n = scanner.nextInt();
        scanner.close();

        System.out.println("The total numbers which are less or equal to the entered  number " + n + " is: "
                + counterFunction(n, arr, length));
    }

    public static int counterFunction(int n, int arr[], int length) {
        int count = 0;
        for (int i = 0; i < length; i++) {

            if (arr[i] <= n) {
                count++;
            }
        }
        return count;
    }

}