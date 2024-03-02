import java.util.Scanner;

public class PL022 {
    public static void main(String[] args) {
        String s;
        System.out.println("Enter the string : ");
        Scanner scanner = new Scanner(System.in);
        s = scanner.nextLine();
        scanner.close();
        System.out.println("The lower case of given string is : " + toLower(s));
    }

    public static String toLower(String s) {

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'A' && chars[i] <= 'Z') {
                chars[i] = (char) (chars[i] + 32);
            }
        }

        s = String.valueOf(chars);
        return s;
    }
}
