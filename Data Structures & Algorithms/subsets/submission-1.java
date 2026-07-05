class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>list=new ArrayList<>();
        SolveIt(nums,list,new ArrayList<>(),0);
        return list;
    }
public static void SolveIt(int[] nums,List<List<Integer>>list,List<Integer>curr,int idx){

    if(idx==nums.length) 
    {
        list.add(new ArrayList<>(curr));
        return ;
    }
   curr.add(nums[idx]);
   SolveIt(nums,list,curr,idx+1);
   curr.remove(curr.size()-1);
   SolveIt(nums,list,curr,idx+1);

    }
}
