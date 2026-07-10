class Solution {
    public int climbStairs(int n) {
        int[] dp=new int[n+1];
        for(int i=0;i<=n;i++){
            dp[i]=-1;
        }
        return dfs(n,dp);
    }
    public int dfs(int n,int[]dp){
        if(dp[n]!=-1) return dp[n];
        if(n==1) return 1;
        if(n==0) return 1;

        int left=dfs(n-1,dp);
        int right=dfs(n-2,dp);
        return dp[n]= left+right;
    }
}
