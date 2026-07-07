class Pair{
    int x;
    int y;
    int level;
    Pair(int x,int y,int level){
        this.x=x;
        this.y=y;
        this.level=level;
    }
}

class Solution {
    public void islandsAndTreasure(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int[] dx={-1,0,1,0};
        int[] dy={0,1,0,-1};
        Queue<Pair>q=new LinkedList<>();
        boolean[][] visited=new boolean[m][n];

     for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            if(grid[i][j]==0){
                q.add(new Pair(i,j,0));
                visited[i][j]=true;
            }
        }
     }
        while(!q.isEmpty()){
            Pair pr=q.poll();
            grid[pr.x][pr.y]=pr.level;
             for(int k=0;k<4;k++){
                int nrow=dx[k]+pr.x;
                int ncol=dy[k]+pr.y;

                if(nrow>=0&&nrow<m&&ncol>=0&&ncol<n&&visited[nrow][ncol]==false&&grid[nrow][ncol]!=-1){
                    visited[nrow][ncol]=true;
                    q.add(new Pair(nrow,ncol,pr.level+1));
                }
             }

        }
        
    }
}
