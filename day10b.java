public class day10b {
    public static void main(String[] args) {
        int n = 7;
        int[] arr = { 2, 3, 4, 6, 3, 3, 6 };
        int key = 3;

        int[] result = findIndex(arr, n, key);
        System.out
                .println("\n\n**Note: -1 in the index answer indicates that the element is not found in the array\n\n");
        System.out.println("Starting index is : " + result[0] + " and last index is : " + result[1]);
    }

    static int result[] = { -1, -1 };

    public static int[] findIndex(int[] arr, int n, int key) {
        int index = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                result[index++] = i;
                break;
            }
        }

        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] == key) {
                result[index++] = i;
                break;
            }
        }

        return result;
    }
}
