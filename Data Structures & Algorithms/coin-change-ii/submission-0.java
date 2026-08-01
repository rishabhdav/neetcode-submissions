class Solution {
    public int change(int amount, int[] coins) {
       int n = coins.length;
        int[][] dp = new int[n][amount + 1];
        for (int i = 0; i <= amount; i++) {
            if (i % coins[0] == 0) {
                dp[0][i] = 1;
            } 
        }

        for (int i = 1; i < n; i++) {
            for (int j = 0; j <= amount; j++) {
                int pick =0;
                if (j >= coins[i]) {
                    pick = dp[i][j - coins[i]];
                }
                int notpick = dp[i - 1][j];
                dp[i][j] = pick+ notpick;
            }
        }
        return dp[n - 1][amount] == Integer.MAX_VALUE - 1 ? -1 : dp[n - 1][amount];
    }
}