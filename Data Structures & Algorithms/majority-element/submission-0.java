class Solution {
    public int majorityElement(int[] nums) {
        int val=-1;
        int cnt=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
           if(cnt==0) val=nums[i];

           if(nums[i]==val)cnt++;
           else cnt--;
        }
        
        int normallength=n/2;
        for(int i=0;i<n;i++){
            if(nums[i]==val) normallength--;
        }
        return normallength<=0? val:-1;
    }
}