import java.util.Arrays;

public class PL039 {
    public static void main(String[] args) {
        int n = 5;
        long[] arr = { 23, 43, 52, 2, 223 };

        System.out.println("Left element is : " + leftElement(arr, n));
        System.out.println(
                "Here left element is calculated as 'Removing the largest element and shortest element alternatively until a single element left.'");
    }

    public static long leftElement(long arr[], long n) {
        int temp = (int) n;
        Arrays.sort(arr);
        if (n % 2 == 0) {
            return (arr[temp / 2 - 1]);
        } else {
            return (arr[temp / 2]);
        }
    }
}
