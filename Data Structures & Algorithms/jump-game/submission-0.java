class Solution {
    public boolean canJump(int[] nums) {
        int ans=0;
        int max=nums[0];
        for(int i=1;i<nums.length;i++){
            if(max<i) return false;
            ans=i+nums[i];
            max=Math.max(max,ans);

            
    }
    return true;
}
}