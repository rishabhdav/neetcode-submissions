class Solution {
public boolean validTree(int n, int[][] edges) {

 if(edges.length==0) return true;
 if(edges.length!=n-1) return false;
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

boolean[] visited=new boolean[n];
for(int i=0;i<n;i++){
    if(visited[i]==false){
       if(dfs(i,list,visited,-1)) return false;
    }
}
for(int i=0;i<n;i++){
    if(visited[i]==false) return false;
}
return true;

    }

public boolean dfs(int node,ArrayList<ArrayList<Integer>>list,boolean[] visited,int parent){
 visited[node]=true;

 for(Integer it:list.get(node)){

    if(visited[it]==false){
        if(dfs(it,list,visited,node)==true) return true;
    }
    else if(parent!=it){
        return true;
    }
 }
return false;
    }
}
