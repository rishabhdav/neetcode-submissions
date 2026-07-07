class Solution {
    public boolean makesquare(int[] matchsticks) {
    int sum=0;
     for(int i=0;i<matchsticks.length;i++){
        sum+=matchsticks[i];
     }

     if(sum%4!=0) return false;
    boolean [] visited=new boolean[matchsticks.length];  
    return SolveIt(0,matchsticks,visited,0,4,sum/4);  
    }
    public static boolean SolveIt(int idx,int[] matchsticks ,boolean[] visited,int subsum,int k,int target){

        if(k==0) return true;

        if(subsum==target){
            return SolveIt(0,matchsticks,visited,0,k-1,target);
        }
        for(int i=idx;i<matchsticks.length;i++){
            if(visited[i]==true||subsum+matchsticks[i]>target) continue;

            visited[i] =true;
            if(SolveIt(i+1,matchsticks,visited,subsum+matchsticks[i],k,target)) return true;
            visited[i]=false;
        }
        return false;
    }

}