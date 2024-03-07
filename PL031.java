import java.util.ArrayList;
import java.util.List;

public class PL031 {
    public static void main(String[] args) {
        int n = 6;
        int x = 314;
        int[] arr = { 1, 2, 34, 34, 72, 91 };
        List<Integer> list = new ArrayList<>();
        list = getMoreAndLess(arr, n, x);
        System.out.println("The number of smaller and equal elements are : " + list.get(0));
        System.out.println("The number of greater and equal elements are : " + list.get(1));
    }

    public static List<Integer> getMoreAndLess(int[] arr, int n, int x) {

        int lessNum = 0;
        int maxNum = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] < x) {
                lessNum++;
            } else if (arr[i] > x) {
                maxNum++;
            } else {
                lessNum++;
                maxNum++;
            }
        }

        List<Integer> result = new ArrayList<>();
        result.add(lessNum);
        result.add(maxNum);

        return result;
    }
}
