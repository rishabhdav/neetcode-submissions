class Solution {
    public int combinationSum4(int[] nums, int target) {
        Arrays.sort(nums);
        return SolveIt(nums, target,0);
    }
    public static int SolveIt(int[] nums, int target, int idx) {
        if(target==0) return 1;
int res=0;
        for(int i=0;i<nums.length;i++){
            
            if(res<0)break;

            if(target>=nums[i]){
                res=res+SolveIt(nums,target-nums[i],idx);
            }
        }
return res;

    }
}