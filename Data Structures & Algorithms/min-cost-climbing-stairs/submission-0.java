class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n];
        for (int i = 0; i < n; i++) {
            dp[i] = -1;
        }
        return Math.min(SolveIt(0, cost, dp), SolveIt(1, cost, dp));
    }

    public static int SolveIt(int idx, int[] costs, int[] dp) {

        if (idx >= costs.length)
            return 0;

        if (dp[idx] != -1)
            return dp[idx];
        int left = costs[idx] + SolveIt(idx + 1, costs, dp);
        int right = costs[idx] + SolveIt(idx + 2, costs, dp);
        return dp[idx] = Math.min(left, right);
    }
}