class Solution {
    public int combinationSum4(int[] nums, int target) {
        int[] dp = new int[target + 1];
        for (int i = 0; i <= target; i++) {
            dp[i] = -1;
        }
        dp[0] = 1;
         SolveIt(dp, nums, target);
         return dp[target];
    }
    public static int SolveIt(int[] dp, int[] nums, int target) {
        if (dp[target] != -1)
            return dp[target];

        if (target == 0)
            return 1;

        int ways = 0;
        for (int i = 0; i < nums.length; i++) {
            if (target >=nums[i]) {
                ways = ways + SolveIt(dp, nums, target - nums[i]);
            
            }
        }
        return dp[target]=ways;
    }
}