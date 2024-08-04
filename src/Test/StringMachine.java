package Test;

import java.util.Scanner;

public class StringMachine {
    // Function to check if s1 is a subsequence of s2
    public static boolean isSubsequence(String s1, char[] s2) {
        int j = 0;
        for (int i = 0; i < s2.length && j < s1.length(); i++) {
            if (s2[i] == s1.charAt(j)) {
                j++;
            }
        }
        return j == s1.length();
    }

    // Function to determine the earliest time when s1 becomes a subsequence of q
    public static int earliestTime(int n, String s1, int m, String s2, int[] p) {
        char[] q = new char[m];
        for (int i = 0; i < m; i++) {
            q[i] = '*';
        }
        for (int t = 0; t < m; t++) {
            q[p[t] - 1] = s2.charAt(t);
            if (isSubsequence(s1, q)) {
                return t + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            scanner.nextLine();
            String s1 = scanner.nextLine();
            int m = scanner.nextInt();
            scanner.nextLine();
            String s2 = scanner.nextLine();
            int[] p = new int[m];
            for (int j = 0; j < m; j++) {
                p[j] = scanner.nextInt();
            }
            System.out.println(earliestTime(n, s1, m, s2, p));
        }
        scanner.close();
    }
}
