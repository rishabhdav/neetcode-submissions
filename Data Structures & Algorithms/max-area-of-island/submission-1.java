class Solution {
     int[] dx={-1,0,1,0};
    int[] dy={0,1,0,-1};
    public int maxAreaOfIsland(int[][] grid) {
   int m=grid.length;
       int n=grid[0].length;  
      boolean[][] visited=new boolean[m][n];
int ans=0;

      for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            if(visited[i][j]==false&&grid[i][j]==1){
                int[] cnt=new int[1];
                cnt[0]++;
                dfs(i,j,visited,grid,cnt);
                ans=Math.max(ans,cnt[0]);
                
            }
        }
      }
      return ans;
    }

   public  void dfs(int i,int j,boolean[][] visited,int[][] grid,int[] cnt){
    int m=grid.length;
    int n=grid[0].length;

    visited[i][j]=true;

    for(int k=0;k<4;k++){
        int nrow=dx[k]+i;
        int ncol=dy[k]+j;

        if(nrow>=0&&nrow<m&&ncol>=0&&ncol<n&&visited[nrow][ncol]==false&&grid[nrow][ncol]==1){
            cnt[0]++;
            dfs(nrow,ncol,visited,grid,cnt);
        
    }

   }     
   }
}
