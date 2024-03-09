import java.util.Scanner;

public class PL036 {

    public static void main(String[] args) {
        String s;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string to convert into the title case ");
        s = scanner.nextLine();
        scanner.close();
        System.out.println("The title case string is : ");
        System.out.println(transform(s));
    }

    public static String transform(String s) {
        char[] temp = s.toCharArray();
        boolean flag = true;
        String result = "";

        for (int i = 0; i < s.length(); i++) {
            if (temp[i] == ' ') {
                flag = true;
                result += temp[i];
                continue;
            }

            if (flag) {
                if (temp[i] >= 'a' && temp[i] <= 'z')
                    temp[i] -= 32;
                flag = false;
            }

            result += temp[i];
        }

        return result;
    }
}