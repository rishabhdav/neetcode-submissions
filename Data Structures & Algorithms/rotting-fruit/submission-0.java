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
    public int orangesRotting(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
int[][] visited=new int[m][n];

Queue<Pair>q=new LinkedList<>();
for(int i=0;i<m;i++){
    for(int j=0;j<n;j++){

        if(grid[i][j]==2){
            q.add(new Pair(i,j,0));
            visited[i][j]=1;
        }
    }
}

int ans=0;
int[] delrow={-1,0,1,0};
int[] delcol={0,1,0,-1};
while(!q.isEmpty()){
Pair p=q.poll();
ans=p.level;
for(int i=0;i<4;i++){
    int nrow=p.x+delrow[i];
    int ncol=p.y+delcol[i];
    if(nrow>=0&&nrow<m&&ncol>=0&&ncol<n&&visited[nrow][ncol]==0&&grid[nrow][ncol]!=0){
        visited[nrow][ncol]=1;
        q.add(new Pair(nrow,ncol,p.level+1));


    }
}

}
for(int i=0;i<m;i++){
    for(int j=0;j<n;j++){

        if(grid[i][j]==1&&visited[i][j]==0){
           return -1;
        }
    }
}
return ans;



    }
}