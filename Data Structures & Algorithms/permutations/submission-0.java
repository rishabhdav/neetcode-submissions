class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>list=new ArrayList<>();
        boolean[] visited=new boolean[nums.length];
        SolveIt(nums,list,new ArrayList<>(),0,visited);
        return list;
    } 
    
    public static void SolveIt(int [] nums,List<List<Integer>>list,List<Integer>curr,int idx,boolean[] visited){

  if(curr.size()==nums.length){
    list.add(new ArrayList<>(curr));
    return ;
  }

  for(int i=0;i<nums.length;i++){
    if(visited[i]==true) continue;

    visited[i]=true;
    curr.add(nums[i]);
    SolveIt(nums,list,curr,idx,visited);
curr.remove(curr.size()-1);
visited[i]=false;
    
  }

    }
}
