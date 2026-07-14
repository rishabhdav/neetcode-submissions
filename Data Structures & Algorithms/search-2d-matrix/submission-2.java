class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;
        int n=matrix.length;
        int low=0;
        int high=m*n-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            int row=mid/m;
            int col=mid%m;
            int result=matrix[row][col];

            if(result==target) return true;

            else if(result>target) high=mid-1;
            else low=mid+1;
        }
        return false;
    }
}
