class Solution {
    public List<Boolean> checkIfPrerequisite(int numCourses, int[][] prerequisites, int[][] queries) {
        
int[] indegree=new int[numCourses];
Queue<Integer>q=new LinkedList<>();
Map<Integer,Set<Integer>>map=new HashMap<>();
ArrayList<ArrayList<Integer>>list=new ArrayList<>();
for(int i=0;i<numCourses;i++){
    list.add(new ArrayList<>());
    map.put(i,new HashSet<>());
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

;
while(!q.isEmpty()){
    int p=q.poll();


    for(Integer it:list.get(p)){
      map.get(it).add(p);
      map.get(it).addAll(map.get(p));  
     indegree[it]--;
     if(indegree[it]==0) q.add(it); 
    }
}

List<Boolean>ans=new ArrayList<>();
for(int[] nums:queries){
int p1=nums[0];
int p2=nums[1];

ans.add(map.get(p2).contains(p1));

}
return ans;
    }
}