public class PL024 {
    public static void main(String[] args) {
        int n = 4, m = 3;
        System.out.println("The relationship between " + n + " and " + m + " is : " + n + " is " + compareNM(n, m)
                + " than " + m + ".");
    }

    public static String compareNM(int n, int m) {
        if (n < m) {
            return "lesser";
        } else if (n == m) {
            return "equal";
        } else {
            return "greater";
        }
    }
}
