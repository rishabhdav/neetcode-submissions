class Solution {
    public int rob(int[] nums) {
        if(nums.length==1) return nums[0];
        int temp=nums[0];
        nums[0]=0;
        int one=rob1(nums);
        nums[0]=temp;
        nums[nums.length-1]=0;
        int two=rob1(nums);
        return Math.max(one,two);
    }

     public  static int rob1(int[] nums) {
        int n=nums.length;

        int[] dp=new int[n+1];
        dp[0]=0;
        dp[1]=nums[0];

        for(int i=2;i<=n;i++){
            int left=nums[i-1]+dp[i-2];
            int right=dp[i-1];
            dp[i]=Math.max(left,right);
        }
        return dp[n];
    }
}
