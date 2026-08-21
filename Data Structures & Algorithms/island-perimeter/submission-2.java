class Pair {
    int x;
    int y;
    Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Solution {
    int[] dx = {-1, 0, 1, 0};
    int[] dy = {0, 1, 0, -1};
    public int islandPerimeter(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        boolean[][] visited = new boolean[m][n];
    
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if ( grid[i][j] == 1) {
                   return dfs(i, j, grid, visited, m, n);
                }
            }
        }
return 0;
    
    }

    public int dfs(int i, int j, int[][] grid, boolean[][] visited, int m, int n) {
        if (i < 0 || j < 0 || i >= m || j >= n)
            return 1;
        if (grid[i][j] == 0)
            return 1;

if (visited[i][j] == true)  return 0;

       visited[i][j]=true;
       int sum=0;
        for (int k = 0; k < 4; k++) {
            int nrow = i + dx[k];
            int ncol = j + dy[k];
            
                sum  +=dfs(nrow, ncol, grid, visited, m, n);
            
        }
        return sum;
    }
}