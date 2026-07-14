class Solution {
    public int splitArray(int[] nums, int k) {
      int s=Integer.MIN_VALUE;
        int e=0;
        for(int i=0;i<nums.length;i++){
            s=Math.max(s,nums[i]);
            e=e+nums[i];
        }
       
        int ans=0;
        while(s<=e){
            int mid=s+(e-s)/2;

            if(getk(nums,mid)<=k){
                ans=mid;
                e=mid-1;
            }
            else s=mid+1;
        }
        return ans;

    }

    public static int getk(int[] nums,int maxweight){
        int cnt=1;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            if(sum+nums[i]<=maxweight){
                sum=sum+nums[i];
                
            }
            else {
                cnt++;
                sum=0;
                sum=nums[i];
            }
        }
return cnt;

    }
}