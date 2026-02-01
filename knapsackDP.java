import java.util.Arrays;

public class knapsackDP {

    // MEMOIZATION (Top-Down)
    public static int knapsackMemo(int val[], int wt[], int W, int n, int dp[][]) {
        if (W == 0 || n == 0) {
            return 0;
        }

        if (dp[n][W] != -1) {
            return dp[n][W];
        }

        if (wt[n - 1] <= W) {
            int include = val[n - 1] + knapsackMemo(val, wt, W - wt[n - 1], n - 1, dp);
            int exclude = knapsackMemo(val, wt, W, n - 1, dp);
            dp[n][W] = Math.max(include, exclude);
        } else {
            dp[n][W] = knapsackMemo(val, wt, W, n - 1, dp);
        }

        return dp[n][W];
    }

    // TABULATION (Bottom-Up)
    public static int knapsackTab(int val[], int wt[], int W) {
        int n = val.length;
        int dp[][] = new int[n + 1][W + 1];

        for (int i = 1; i <= n; i++) {
            for (int w = 1; w <= W; w++) {
                if (wt[i - 1] <= w) {
                    dp[i][w] = Math.max(
                            val[i - 1] + dp[i - 1][w - wt[i - 1]],
                            dp[i - 1][w]
                    );
                } else {
                    dp[i][w] = dp[i - 1][w];
                }
            }
        }
        return dp[n][W];
    }


    public static void main(String[] args) {
        int val[] = {15, 14, 10, 45, 30};
        int wt[] = {2, 5, 1, 3, 4};
        int W = 7;
        int n = val.length;

        // Memoization
        int dp[][] = new int[n + 1][W + 1];
        for (int i = 0; i <= n; i++) {
            Arrays.fill(dp[i], -1);
        }

        System.out.println("Memoization Result: " +
                knapsackMemo(val, wt, W, n, dp));

        // Tabulation
        System.out.println("Tabulation Result: " +
                knapsackTab(val, wt, W));
    }
}