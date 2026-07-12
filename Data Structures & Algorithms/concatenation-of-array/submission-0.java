class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] nums1=new int[2*nums.length];
int k=nums.length;
for(int i=0;i<k;i++){
    nums1[i]=nums[i];
    nums1[k+i]=nums[i];
}
return nums1;
    }
}