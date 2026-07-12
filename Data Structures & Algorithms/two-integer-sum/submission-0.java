class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans=new int[2];
        Arrays.sort(nums);
        int s=0;
        int e=nums.length-1;
        while(s<e){
            int sum=nums[s]+nums[e];
            if(sum==target){
                ans[0]=s;
                ans[1]=e;
                return ans;
            }
            else if(sum>target) e--;
            else s++;
        }
        return ans;
        
    }
}
