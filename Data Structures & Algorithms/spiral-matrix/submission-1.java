class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;
        while (left<=right && top <=bottom) {
            for (int i = left; i <= right; i++) {
                list.add(matrix[top][i]);
            }
            top++;
            for (int j = top; j <= bottom; j++) {
                list.add(matrix[j][right]);
            }
            right--;
           if (left > right || top > bottom) {
    break;
}

            for (int k = right; k >= left; k--) {
                list.add(matrix[bottom][k]);
            }
            bottom--;

            for (int l = bottom; l >= top; l--) {
                list.add(matrix[l][left]);
            }
            left++;
        }
        return list;
    }
}
