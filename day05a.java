 
public class day05a {

    public static void main(String[] args) {

        int[] arr = { 121, 232, 343, 545, 545 };

        System.out.println(palindromeArray(arr) ? "Yes it is an palindrome array" : "No it is not an palindrome array");
    }

    public static int reverseNumber(int n) {
        int finalValue = 0;

        while (n != 0) {
            int digit = n % 10;
            finalValue = finalValue * 10 + digit;
            n /= 10;
        }
        return finalValue;
    }

    public static boolean palindromeArray(int[] arr) {
        for (int i : arr) {
            if (i != reverseNumber(i)) {
                return false;
            }
        }
        return true;
    }

}
