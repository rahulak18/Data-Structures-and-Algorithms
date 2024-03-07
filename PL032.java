public class PL032 {
    public static void main(String[] args) {
        printNumbers(8);
    }

    public static void printNumbers(int n) {
        if (n == 0) {
            return;
        }

        printNumbers(n - 1);
        System.out.print(n + " ");
    }
}
