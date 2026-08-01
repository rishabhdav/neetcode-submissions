class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int totalsum=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            totalsum=totalsum+nums[i];
        }
         target=totalsum-target;
         if(target<0||target%2==1) return 0;
        target=target/2;
      
        int[][] dp=new int[n+1][target+1];
       
         if(nums[0] == 0)
            dp[0][0] = 2;
        else
            dp[0][0] = 1;

        if(nums[0] != 0 && nums[0] <= target)
            dp[0][nums[0]] = 1;


        for(int i=1;i<n;i++){
            for(int j=0;j<=target;j++){
                int pick=0;
                 if(j>=nums[i]){
                    pick=dp[i-1][j-nums[i]];
                 }
                 int notpick=dp[i-1][j];
                 dp[i][j]=pick+notpick;
            }
        }
        return dp[n-1][target];

    }
}
