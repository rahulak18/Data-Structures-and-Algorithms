import java.util.ArrayList;
import java.util.List;

public class PL033 {
    public static void main(String[] args) {
        int n = 6;

        int arr[] = { 2, 4, 53, 32, 24, 46 };

        List<Integer> list = new ArrayList<>();
        list = findElements(arr, n);

        for (Integer i : list) {
            System.out.println(i);
        }
    }

    public static List<Integer> findElements(int[] arr, int n) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(arr[i]);
        }

        list.sort(null);

        list.remove(n - 1);
        list.remove(n - 2);

        return list;
    }
}
