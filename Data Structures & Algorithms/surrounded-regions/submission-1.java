class Solution {
    int[] dx={-1,0,1,0};
    int[] dy={0,1,0,-1};
    public void solve(char[][] board) {
    int m=board.length;
    int n=board[0].length;  
    boolean[][] visited=new boolean[m][n];

 for(int i=0;i<n;i++){
   if(visited[0][i]==false&&board[0][i]=='O'){
    dfs(0,i,visited,board);
   }
 }
  

 for(int i=0;i<n;i++){
   if(visited[m-1][i]==false&&board[m-1][i]=='O'){
    dfs(m-1,i,visited,board);
   }
 }
 for(int i=0;i<m;i++){
   if(visited[i][0]==false&&board[i][0]=='O'){
    dfs(i,0,visited,board);
   }
 }

 for(int i=0;i<m;i++){
   if(visited[i][n-1]==false&&board[i][n-1]=='O'){
    dfs(i,n-1,visited,board);
   }

 } 
 for(int i=0;i<m;i++){
   for(int j=0;j<n;j++){
    if(visited[i][j]==false&&board[i][j]=='O'){
        board[i][j]='X';
    }
   }

 } 
 
 
   }

   public  void dfs(int i,int j,boolean[][] visited,char[][] board){
    int m=board.length;
    int n=board[0].length;

    visited[i][j]=true;

    for(int k=0;k<4;k++){
        int nrow=dx[k]+i;
        int ncol=dy[k]+j;

        if(nrow>=0&&nrow<m&&ncol>=0&&ncol<n&&visited[nrow][ncol]==false&&board[nrow][ncol]=='O'){
            dfs(nrow,ncol,visited,board);
        
    }

   }     
   }
}
