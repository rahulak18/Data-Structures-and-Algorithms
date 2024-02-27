import java.util.Scanner;

public class day08 {
    public static void main(String[] args) {

        String str;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string to validate it is the binary string or not : ");
        str = scanner.nextLine();
        scanner.close();

        if (isBinary(str)) {
            System.out.println("yes it is binary string");
        } else {
            System.out.println("No it is not binary string");
        }
    }

    public static boolean isBinary(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != '1' && str.charAt(i) != '0') {
                return false;
            }
        }

        return true;
    }
}
