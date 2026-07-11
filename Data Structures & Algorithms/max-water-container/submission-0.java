class Solution {
    public int maxArea(int[] heights) {

       int max=Integer.MIN_VALUE;
    int s=0;
    int e=heights.length-1;
    while(s<e){
        int  b=Math.min(heights[s],heights[e]);
        max=Math.max(max,b*(e-s));

        if(heights[s]>=heights[e]) e--;
        else s++;
    } 
    return max;
    }
}
