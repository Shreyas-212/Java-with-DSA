import java.util.*;

public class mcmDP {

    // Recursion
    public static int mcmRec(int arr[], int i, int j) {
        if (i == j) return 0;

        int ans = Integer.MAX_VALUE;
        for (int k = i; k < j; k++) {
            int cost = mcmRec(arr, i, k)
                     + mcmRec(arr, k + 1, j)
                     + arr[i - 1] * arr[k] * arr[j];
            ans = Math.min(ans, cost);
        }
        return ans;
    }

    // Memoization 
    public static int mcmMemo(int arr[], int i, int j, int dp[][]) {
        if (i == j) return 0;

        if (dp[i][j] != -1) return dp[i][j];

        int ans = Integer.MAX_VALUE;
        for (int k = i; k < j; k++) {
            int cost = mcmMemo(arr, i, k, dp)
                     + mcmMemo(arr, k + 1, j, dp)
                     + arr[i - 1] * arr[k] * arr[j];
            ans = Math.min(ans, cost);
        }

        return dp[i][j] = ans;
    }

    // Tabulation 
    public static int mcmTab(int arr[]) {
        int n = arr.length;
        int dp[][] = new int[n][n];

        for (int len = 2; len < n; len++) {
            for (int i = 1; i <= n - len; i++) {
                int j = i + len - 1;
                dp[i][j] = Integer.MAX_VALUE;

                for (int k = i; k < j; k++) {
                    int cost = dp[i][k]
                             + dp[k + 1][j]
                             + arr[i - 1] * arr[k] * arr[j];
                    dp[i][j] = Math.min(dp[i][j], cost);
                }
            }
        }
        return dp[1][n - 1];
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 3};
        int n = arr.length;

        System.out.println("Recursion: " + mcmRec(arr, 1, n - 1));

        int dp[][] = new int[n][n];
        for (int[] row : dp) Arrays.fill(row, -1);
        System.out.println("Memoization: " + mcmMemo(arr, 1, n - 1, dp));

        System.out.println("Tabulation: " + mcmTab(arr));
    }
}