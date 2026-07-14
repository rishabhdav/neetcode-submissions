class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l=0;
        int r=0;
        int minlength=Integer.MAX_VALUE;
        int sum=0;
        while(r<nums.length){
          sum=sum+nums[r];

          while(sum>=target){
            minlength=Math.min(minlength,r-l+1);
            sum=sum-nums[l];
            l++;
          }
          r++;
        }

        return minlength==Integer.MAX_VALUE?0:minlength;
    }
}