public class stringConversion { 
    public static int lcs(String s1, String s2) {
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

    public static void stringConversion(String str1, String str2) {
        int lcsLen = lcs(str1, str2);

        int deletions = str1.length() - lcsLen;
        int insertions = str2.length() - lcsLen;

        System.out.println("Deletions = " + deletions);
        System.out.println("Insertions = " + insertions);
    }

    public static void main(String[] args) {
        String str1 = "pear";
        String str2 = "sea";

        stringConversion(str1, str2);
    }
}