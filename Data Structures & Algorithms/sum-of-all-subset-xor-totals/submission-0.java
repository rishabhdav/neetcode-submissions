class Solution {
    public int subsetXORSum(int[] nums) {
   int[] sum=new int[1];
        SolveIt(nums,sum,0,0);
        return sum[0];
        
    }
    public static void SolveIt(int[] nums,int[] sum,int xor,int idx){

        if(idx==nums.length){
            sum[0]=sum[0]+xor;
            return;
        }
        xor=xor^nums[idx];
        SolveIt(nums,sum,xor,idx+1);
        xor=xor^nums[idx];
        SolveIt(nums,sum,xor,idx+1);

    }
}