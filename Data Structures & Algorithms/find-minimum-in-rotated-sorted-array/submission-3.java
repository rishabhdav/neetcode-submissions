class Solution {
    public int findMin(int[] nums) {
        
        int s=0;
        int e=nums.length-1;
        int n=nums.length;
        while(s<=e){
            int mid=s+(e-s)/2;

            int prev=(mid+1)%n;
            int next=(mid+n-1)%n;

            if(nums[mid]<=nums[prev]&&nums[mid]<=nums[next]){
                return nums[mid];
        }
        else if(nums[mid]>nums[e]){
            s=mid+1;
        }
        else{
            e=mid-1;
        }
        
    }
    return -1;
}

}