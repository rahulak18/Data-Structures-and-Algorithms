public class PL018 {
    public static void main(String[] args) {
        int n = 6;
        int k = 1;
        int[] arr = { 12, 23, 44, 445, 324, 231 };
        printArr(arr, n);
        swapkth(n, k, arr);
        printArr(arr, n);
    }

    public static void printArr(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void swapkth(int n, int k, int[] arr) {
        int temp = arr[k - 1];
        arr[k - 1] = arr[n - k];
        arr[n - k] = temp;
    }
}
