class Solution {
    public int findDuplicate(int[] nums) {
        int i=0;
     while(i<nums.length){
            int correct=nums[i]-1;
            if(nums[i]!=nums[correct]){
                swap(i,correct,nums);
            }
            else i++;

        }

        for(int j=0;j<nums.length;j++){
            if(nums[j]!=j+1) return nums[j];
        }
        return -1;
    }
    public static void swap(int s,int e,int[] nums){

        int temp=nums[s];
        nums[s]=nums[e];
        nums[e]=temp;
    }

}
