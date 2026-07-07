class Solution {
    public boolean canPartitionKSubsets(int[] nums, int k) {
     int sum=0;
     for(int i=0;i<nums.length;i++){
        sum+=nums[i];
     }
     if(sum%k!=0) return false;
    boolean [] visited=new boolean[nums.length];  
    return SolveIt(0,nums,visited,0,k,sum/k);  
    }
    public static boolean SolveIt(int idx,int[] nums ,boolean[] visited,int subsum,int k,int target){

        if(k==0) return true;

        if(subsum==target){
            return SolveIt(0,nums,visited,0,k-1,target);
        }
        for(int i=idx;i<nums.length;i++){
            if(visited[i]==true||subsum+nums[i]>target) continue;

            visited[i] =true;
            if(SolveIt(i+1,nums,visited,subsum+nums[i],k,target)) return true;
            visited[i]=false;
        }
        return false;
    }

}