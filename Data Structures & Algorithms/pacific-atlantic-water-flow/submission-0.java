class Solution {

    int[] dx={-1,0,1,0};
    int[] dy={0,1,0,-1};
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int m=heights.length;
        int n=heights[0].length;
        boolean[][] pacific=new boolean[m][n];
        boolean[][] alantic=new boolean[m][n];

        for(int i=0;i<n;i++){
            dfs(0,i,pacific,heights,heights[0][i]);
            dfs(m-1,i,alantic,heights,heights[m-1][i]);    
        }
        for(int j=0;j<m;j++){
            dfs(j,0,pacific,heights,heights[j][0]);
            dfs(j,n-1,alantic,heights,heights[j][n-1]);    
        }
      List<List<Integer>>list=new ArrayList<>();
      for(int k=0;k<m;k++){
        for(int l=0;l<n;l++){
            if(pacific[k][l]==true&&alantic[k][l]==true){
                List<Integer>temp=new ArrayList<>();
                temp.add(k);
                temp.add(l);
                list.add(temp);
            }
        }
      }
return list;
    }

    public  void dfs(int i,int j,boolean[][] visited,int[][] heights,int prevheights){
        int m=heights.length;
        int n=heights[0].length;
      
      
            if(i<0||i>=m||j<0||j>=n||visited[i][j]==true||prevheights>heights[i][j]){
               return;
               
            }
          visited[i][j]=true;

          for(int k=0;k<4;k++){
            int nr=dx[k]+i;
            int nc=dy[k]+j;
        dfs(nr,nc,visited,heights,heights[i][j]);         
}
 

    }
}
