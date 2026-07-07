class Solution {
    public List<List<String>> solveNQueens(int n) {
  Map<Integer,Integer>nd=new HashMap<>();
  Map<Integer,Integer>pd=new HashMap<>();
  Map<Integer,Integer>c=new HashMap<>();
  char[][] board=new char[n][n];
  for(int i=0;i<n;i++){
    for(int j=0;j<n;j++){
        board[i][j]='.';
    }
  }
List<List<String>>list=new ArrayList<>();
SolveIt(board,nd,pd,c,0,n,list);
return list;
    }
    public static void SolveIt(char[][] board,Map<Integer,Integer>nd,Map<Integer,Integer>pd,Map<Integer,Integer>c,int idx,int n,List<List<String>>list){
if(idx==n){
    List<String>str=new ArrayList<>();
    for(char[] ch:board){
        str.add(new String(ch));
    }
    list.add(str);
    return;
}
 for(int i=0;i<n;i++){
    if(pd.containsKey(idx+i)||nd.containsKey(idx-i)||c.containsKey(i)) continue;

    board[idx][i]='Q';
    pd.put(idx+i,1);
    nd.put(idx-i,1);
    c.put(i,1);

    SolveIt(board,nd,pd,c,idx+1,n,list);
      board[idx][i]='.';
    pd.remove(idx+i);
    nd.remove(idx-i);
    c.remove(i,1);

 }

}




    
}
