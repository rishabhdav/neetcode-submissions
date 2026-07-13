class Solution {
    public int removeElement(int[] nums, int val) {
        if(nums.length==0) return 0;
        int j=0;
        while(j<nums.length&&nums[j]!=val){
            j++;
        }
        if(j==nums.length) return j;

        for(int i=j;i<nums.length;i++){
           if(nums[i]!=nums[j]){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            j++;
            while(j<nums.length&&nums[j]!=val){
            j++;
        }

        }
    }
    return j;
}
}