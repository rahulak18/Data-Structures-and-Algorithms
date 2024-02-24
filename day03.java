
public class day03 {

    public static void main(String[] args) {
        // int n = 5; It can be used when we are inputing the elements from the user
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 89 };

        printAlternateElements(arr);

    }

    public static void printAlternateElements(int[] arr) {
        int track = 0;
        for (int i : arr) {
            if (track % 2 == 0) {
                System.out.print(i + " ");
            }

            track++;
        }
    }
}