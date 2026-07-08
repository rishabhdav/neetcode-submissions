class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
       
int[] indegree=new int[numCourses];
Queue<Integer>q=new LinkedList<>();

ArrayList<ArrayList<Integer>>list=new ArrayList<>();
for(int i=0;i<numCourses;i++){
    list.add(new ArrayList<>());
}
for(int[] arr:prerequisites){
    int u=arr[0];
    int v=arr[1];
    list.get(u).add(v);
    indegree[v]++;

}
for(int i=0;i<numCourses;i++){
    if(indegree[i]==0) q.add(i);
}

int[] topo=new int[numCourses];
int idx=0;
while(!q.isEmpty()){
    int p=q.poll();

   topo[idx]=p;
   idx++;

    for(Integer it:list.get(p)){
     indegree[it]--;
     if(indegree[it]==0) q.add(it); 
    }
}
return idx==numCourses;

    }
}