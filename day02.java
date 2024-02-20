import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class day02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 6;
        // n = scanner.nextInt();
        int[] arr = { 1, 2, 33, 4, 5, 5, 7, 9 };

        List<Integer> list = new ArrayList<>();
        list = equalToIndex(arr, n);
        for (Integer i : list) {
            System.out.println(i + " ");
        }

        scanner.close();

    }

    public static List<Integer> equalToIndex(int[] arr, int n) {
        List<Integer> resultedArray = new ArrayList<>();
        int k = 0;
        for (int i : arr) {
            if (i == (k + 1)) {
                resultedArray.add(i);
            }
            k++;
        }
        return resultedArray;
    }
}