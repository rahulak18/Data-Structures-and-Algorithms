public class PL025 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 22, 1 };
        System.out.println("Is given array perfect : " + isPerfectArray(arr));

    }

    public static boolean isPerfectArray(int[] arr) {
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            if (arr[i] != arr[j]) {
                return false;
            }
        }

        return true;
    }
}
