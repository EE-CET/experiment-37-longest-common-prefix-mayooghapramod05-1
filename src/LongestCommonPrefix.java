import java.util.Scanner;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            if (!sc.hasNextInt()) return;
            int n = sc.nextInt();
            if (n == 0) {
                System.out.println("-1");
                return;
            }
            sc.nextLine(); // consumes newline after n

            String[] strs = new String[n];
            for (int i = 0; i < n; i++) {
                if (sc.hasNextLine()) {
                    strs[i] = sc.nextLine();
                }
            }

            if (n == 1) {
                System.out.println(strs[0].isEmpty() ? "-1" : strs[0]);
                return;
            }

            String prefix = strs[0];

            for (int i = 1; i < n; i++) {
                while (strs[i].indexOf(prefix) != 0) {
                    prefix = prefix.substring(0, prefix.length() - 1);
                    if (prefix.isEmpty()) {
                        System.out.println("-1");
                        return;
                    }
                }
            }

            System.out.println(prefix);
        }
    }
}
