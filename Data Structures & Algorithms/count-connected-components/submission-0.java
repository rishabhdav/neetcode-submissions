class Solution {
public int countComponents(int n, int[][] edges) {

ArrayList<ArrayList<Integer>>list=new ArrayList<>();

for(int i=0;i<n;i++){
    list.add(new ArrayList<>());
}

for(int[] arr:edges){
    int u=arr[0];
    int v=arr[1];
    list.get(u).add(v);
    list.get(v).add(u);
}
int cnt=0;
boolean[] visited=new boolean[n];
for(int i=0;i<n;i++){
    if(visited[i]==false){
        cnt++;
       dfs(i,list,visited);
    }
}

return cnt;

    }

public void dfs(int node,ArrayList<ArrayList<Integer>>list,boolean[] visited){
 visited[node]=true;

 for(Integer it:list.get(node)){

    if(visited[it]==false){
       dfs(it,list,visited);
    }
    
    }
}
}
