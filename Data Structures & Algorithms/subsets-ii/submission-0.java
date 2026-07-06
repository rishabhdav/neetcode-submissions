class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
       Arrays.sort(nums);
        List<List<Integer>>list=new ArrayList<>();
        SolveIt(nums,list,new ArrayList<>(),0);
        return list;
    }
public static void SolveIt(int[] nums,List<List<Integer>>list,List<Integer>curr,int idx){

    if(idx==nums.length) 
    {     
    list.add(new ArrayList<>(curr));
    return;
    }
  

         curr.add(nums[idx]);
         SolveIt(nums,list,curr,idx+1);
         curr.remove(curr.size()-1);

   while(idx+1<nums.length &&nums[idx+1]==nums[idx]) idx++;
        SolveIt(nums,list,curr,idx+1);

    }
}