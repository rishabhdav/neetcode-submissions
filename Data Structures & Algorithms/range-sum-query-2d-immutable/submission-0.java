class NumMatrix {
int[][] ans;
int sum;
    public NumMatrix(int[][] matrix) {
        this.ans=matrix;
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        sum=0;

        for(int i=col1;i<=col2;i++){
            sum=sum+ans[row1][i];
        }
         for(int i=col1;i<=col2;i++){
            sum=sum+ans[row2][i];
        } for(int i=row1;i<=row2;i++){
            sum=sum+ans[i][col1];
        } for(int i=row1;i<=row2;i++){
            sum=sum+ans[i][col2];
        }
        return sum-ans[row1][col1]-ans[row1][col2]-ans[row2][col1]-ans[row2][col2];
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */