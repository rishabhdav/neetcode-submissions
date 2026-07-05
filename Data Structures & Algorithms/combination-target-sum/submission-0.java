class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        
        List<List<Integer>>list=new ArrayList<>();
        SolveIt(nums,list,new ArrayList<>(),0,target);
        return list;
    }
public static void SolveIt(int[] nums,List<List<Integer>>list,List<Integer>curr,int idx,int target){

    if(idx==nums.length) 
    {
       if(target==0){
         list.add(new ArrayList<>(curr));
       
       }
       return;
    }
  
  if(nums[idx]<=target){
    curr.add(nums[idx]);
         SolveIt(nums,list,curr,idx,target-nums[idx]);
     curr.remove(curr.size()-1);
  }
   
   SolveIt(nums,list,curr,idx+1,target);

    }
}
