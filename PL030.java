import java.util.Scanner;

public class PL030 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s;
        System.out.println("Enter the string : ");
        s = scanner.nextLine();
        System.out.println("Reversed string is : " + reverseString(s));
        scanner.close();
    }

    public static String reverseString(String s) {
        String result = "";
        char[] temp = s.toCharArray();

        for (int i = s.length() - 1; i >= 0; i--) {
            result += temp[i];
        }

        return result;
    }
}
