public class PL038 {
    public static void main(String[] args) {
        int n = 6;
        int[] arr = { 2, 34, 2, 32, 4, 12 };

        System.out.println("Average is : " + average(arr, n));
    }

    public static String average(int A[], int N) {
        double avg;
        double sum = 0;
        for (int i : A) {
            sum += i;
        }

        avg = (double) (sum / N);
        String result = String.format("%.2f", avg);
        return result;
    }
}
