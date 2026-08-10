class Solution {
    public int trap(int[] height) {

int n=height.length;
int[] suffixMax=new int[n];
for(int i=n-2;i>=0;i--){
    suffixMax[i]=Math.max(suffixMax[i+1],height[i]);
}
int total=0;
int prefixMax=0;
for(int i=0;i<n;i++){
    int val=Math.min(prefixMax,suffixMax[i])-height[i];
    total=total+(val<=0?0:val);
    prefixMax=Math.max(prefixMax,height[i]);
   
}

return total;

    }
}
