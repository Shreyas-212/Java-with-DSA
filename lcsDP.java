public class lcsDP {

    // Recursive (Brute Force)
    public static int lcsRec(String s1, String s2, int n, int m) {
        if (n == 0 || m == 0) {
            return 0;
        }

        if (s1.charAt(n - 1) == s2.charAt(m - 1)) {
            return 1 + lcsRec(s1, s2, n - 1, m - 1);
        } else {
            return Math.max(
                    lcsRec(s1, s2, n - 1, m),
                    lcsRec(s1, s2, n, m - 1)
            );
        }
    }

    // Memoization (Top-Down DP)
    public static int lcsMemo(String s1, String s2, int n, int m, int dp[][]) {
        if (n == 0 || m == 0) {
            return 0;
        }

        if (dp[n][m] != -1) {
            return dp[n][m];
        }

        if (s1.charAt(n - 1) == s2.charAt(m - 1)) {
            dp[n][m] = 1 + lcsMemo(s1, s2, n - 1, m - 1, dp);
        } else {
            dp[n][m] = Math.max(
                    lcsMemo(s1, s2, n - 1, m, dp),
                    lcsMemo(s1, s2, n, m - 1, dp)
            );
        }

        return dp[n][m];
    }

    // Tabulation (Bottom-Up DP)
    public static int lcsTab(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();

        int dp[][] = new int[n + 1][m + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {

                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        return dp[n][m];
    }

    public static void main(String[] args) {
        String str1 = "abcdge";
        String str2 = "abedg";

        int n = str1.length();
        int m = str2.length();

        System.out.println("Recursive LCS = " + lcsRec(str1, str2, n, m));

        int dp[][] = new int[n + 1][m + 1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                dp[i][j] = -1;
            }
        }

        System.out.println("Memoization LCS = " + lcsMemo(str1, str2, n, m, dp));
        System.out.println("Tabulation LCS = " + lcsTab(str1, str2));
    }
}