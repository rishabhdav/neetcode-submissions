class Solution {
    int[] dx=new int[]{-1,0,1,0};
    int[] dy=new int[]{0,1,0,-1};
    public boolean exist(char[][] board, String word) {
    int m=board.length;
    int n=board[0].length;
    boolean [][] visited=new boolean[m][n];
    for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            if(word.charAt(0)==board[i][j]){
                if(SolveIt(board,word,visited,1,i,j)){
                    return true;
                }
            }
        }
    }
    return false;
      
        
    }
    public  boolean SolveIt(char[][] board, String word,boolean[][] visited,int idx,int i,int j){
    int m=board.length;
    int n=board[0].length;
        if(idx==word.length()){
            return true;
        }
        visited[i][j]=true;
        for(int k=0;k<4;k++){
            int nrow=i+dx[k];
            int ncol=j+dy[k];

            if(nrow>=0&&nrow<m&&ncol>=0&&ncol<n&&!visited[nrow][ncol]&&word.charAt(idx)==board[nrow][ncol]){
                if(SolveIt(board,word,visited,idx+1,nrow,ncol)){
                    return true;
                }
            }
        }
        visited[i][j]=false;
return false;
    }
}
