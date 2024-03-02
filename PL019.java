public class PL019 {
    public static void main(String[] args) {
        int n = 7;
        String[] names = { "Kane williamson", "Ravindra Jadeja", "Suresh Raina", "Anil kumble", "Gautam Gambhir",
                "MS Dhoni", "Ruturaj Gaikwad" };

        System.out.println("The longest name from the given array is : " + displayLongName(names, n));
    }

    public static String displayLongName(String[] names, int n) {
        int length = 0;
        String longName = "";

        for (int i = 0; i < n; i++) {
            if (length < names[i].length()) {
                length = names[i].length();
                longName = names[i];
            }
        }

        return longName;
    }
}
