class Solution {
    public int combinationSum4(int[] nums, int target) {
        Arrays.sort(nums);


        
        if (target == 0)
            return 1;
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            if (res < 0)
                break;

            if (target >= nums[i]) {
                res = res + combinationSum4(nums, target - nums[i]);
            }
        }
        return res;
    }
}
