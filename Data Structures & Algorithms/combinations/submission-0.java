class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>>list=new ArrayList<>();

      
         SolveIt(new ArrayList<>(),list,n,k,1);
         return list;
    }
public static void SolveIt(List<Integer>curr,List<List<Integer>>list,int n,int k,int idx){


if(curr.size()==k){
list.add(new ArrayList<>(curr));
return;
     }

for(int i=idx;i<=n;i++){
    curr.add(i);
    SolveIt(curr,list,n,k,i+1);
    curr.remove(curr.size()-1);
}


    }
}