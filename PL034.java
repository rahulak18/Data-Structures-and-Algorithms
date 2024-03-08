import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PL034 {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number : ");
        n = scanner.nextInt();
        scanner.close();
        System.out.println("Below is the multiplication of the number : " + n);
        List<Integer> list = new ArrayList<>();
        list = getMultiplication(n);
        for (int i : list) {
            System.out.print(i + " ");
        }
    }

    public static List<Integer> getMultiplication(int n) {
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i < 11; i++) {
            list.add(n * i);
        }

        return list;
    }
}
