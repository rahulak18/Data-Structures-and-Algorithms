
public class day09 {

    public static void main(String[] args) {
        int n = 5;
        int[] arr = { 1, 2, 3, 4, 5 };

        System.out.println("Sum of the array is : " + sumOfArray(arr, n));

    }

    public static int sumOfArray(int[] arr, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

        return sum;
    }

}