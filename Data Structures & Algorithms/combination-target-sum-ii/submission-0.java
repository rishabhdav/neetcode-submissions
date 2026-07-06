class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        
        Arrays.sort(candidates);
        List<List<Integer>>list=new ArrayList<>();
        SolveIt(candidates,target,new ArrayList<>(),list,0);
        return list;

    }
    public static void SolveIt(int[] nums,int target,List<Integer>curr,List<List<Integer>>list,int idx){
        if(target==0) {
            list.add(new ArrayList<>(curr));
            return ;
        }
        if(target<0) return;
      
        for(int i=idx;i<nums.length;i++){
          if(i>idx&&nums[i-1]==nums[i] ) continue;
           curr.add(nums[i]);
           SolveIt(nums,target-nums[i],curr,list,i+1);
           curr.remove(curr.size()-1);
         

        }
    }
}
