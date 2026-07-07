class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>>list=new ArrayList<>();
        boolean[] visited =new boolean[nums.length];
        SolveIt(nums,list,visited,new ArrayList<>());
        
        return list;
        
    }
    public static void SolveIt(int[] nums,List<List<Integer>>list,boolean[] visited,List<Integer>curr){
     if(curr.size()==nums.length){
        list.add(new ArrayList<>(curr));
        return;
     }

     for(int i=0;i<nums.length;i++){

        if(visited[i] ==true) continue;


         if(i>0&&nums[i-1]==nums[i]&&!visited[i-1]) continue;

        visited[i]=true;
        curr.add(nums[i]);
        SolveIt(nums,list,visited,curr);
        curr.remove(curr.size()-1);
        visited[i]=false;
     }

    }
}