import java.util.Arrays;
import java.util.Scanner;

public class StringOddEven {
    public static void main(String[] args) {
        String[] strs = getStrings();
        System.out.println(Arrays.toString(strs));
        printResult(strs);
    }

    private static String[] getStrings() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of words: ");
        int n = sc.nextInt();
        sc.nextLine();
        String[] strs = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the #" + i + 1 + " word: ");
            strs[i] = sc.nextLine();
        }
        return strs;
    }

    public static void printResult(String[] strs) {
        for (String s: strs) {
            int len = s.length();
            for(int i = 0; i < len; i += 2) {
                System.out.print(s.charAt(i));
            }
            System.out.print(" ");
            for(int i = 1; i < len; i += 2) {
                System.out.print(s.charAt(i));
            }
            System.out.println();
        }
    }
}
