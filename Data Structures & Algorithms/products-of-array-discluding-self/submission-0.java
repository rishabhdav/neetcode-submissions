class Solution {
    public int[] productExceptSelf(int[] nums) {
       int n=nums.length;
       int[] temp=new int[n];
       int prefix=1;
       for(int i=0;i<n;i++){
        temp[i]=prefix;
        prefix=prefix*nums[i];
       } 

       int suffix=1;
       for(int i=nums.length-1;i>=0;i--){
        temp[i]=suffix*temp[i];
        suffix=suffix*nums[i];
       
       }
       return temp;
    }
}  
