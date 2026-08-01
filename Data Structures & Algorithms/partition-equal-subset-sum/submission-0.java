class Solution {
    public boolean canPartition(int[] nums) {
        int totalsum = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            totalsum = totalsum + nums[i];
        }
        if (totalsum % 2 == 1)
            return false;
        int target = totalsum / 2;
        boolean[][] dp = new boolean[n][target + 1];
        if (nums[0] <= target)
            dp[0][nums[0]] = true;

        for (int i = 1; i < n; i++) {
            for (int j = 0; j <= target; j++) {
                boolean pick = false;
                if (j >= nums[i]) {
                    pick = dp[i - 1][j - nums[i]];
                }
                boolean notpick = dp[i - 1][j];
                dp[i][j] = pick || notpick;
            }
        }
        return dp[n - 1][target];
    }
}
