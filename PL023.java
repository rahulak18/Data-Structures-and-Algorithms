public class PL023 {
    public static void main(String[] args) {
        String s = "Gokul    Nandan";
        System.out.println("Original string is : " + s);
        System.out.println("Removed spaces from the string : " + stringModify(s));

    }

    public static String stringModify(String s) {
        return s.replaceAll(" ", "");
    }
}
