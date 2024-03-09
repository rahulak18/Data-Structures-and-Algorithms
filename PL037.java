import java.util.Scanner;

public class PL037 {
    public static void main(String[] args) {
        String s;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string : ");
        s = scanner.nextLine();
        scanner.close();
        System.out.println("Reversed string vowel : " + modify(s));
    }

    public static String modify(String s) {

        char[] tempString = s.toCharArray();
        for (int i = 0, j = s.length() - 1; i < j;) {

            if ((tempString[i] == 'a' || tempString[i] == 'e' || tempString[i] == 'i' || tempString[i] == 'o'
                    || tempString[i] == 'u')
                    && (tempString[j] == 'a' || tempString[j] == 'e' || tempString[j] == 'i' || tempString[j] == 'o'
                            || tempString[j] == 'u')) {
                char temp = tempString[i];
                tempString[i] = tempString[j];
                tempString[j] = temp;
                i++;
                j--;
                continue;
            }

            if (tempString[i] != 'a' && tempString[i] != 'e' && tempString[i] != 'i' && tempString[i] != 'o'
                    && tempString[i] != 'u') {
                i++;
            }
            if (tempString[j] != 'a' && tempString[j] != 'e' && tempString[j] != 'i' && tempString[j] != 'o'
                    && tempString[j] != 'u') {
                j--;
            }

        }

        String result = new String(tempString);
        return result;
    }
}
