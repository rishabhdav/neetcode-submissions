class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int s=Integer.MIN_VALUE;
        int e=0;
        for(int i=0;i<weights.length;i++){
            s=Math.max(s,weights[i]);
            e=e+weights[i];
        }
       
        int ans=0;
        while(s<=e){
            int mid=s+(e-s)/2;

            if(getDays(weights,mid)<=days){
                ans=mid;
                e=mid-1;
            }
            else s=mid+1;
        }
        return ans;

    }

    public static int getDays(int[] weights,int maxweight){
        int cnt=1;
        int sum=0;
        for(int i=0;i<weights.length;i++){
            if(sum+weights[i]<=maxweight){
                sum=sum+weights[i];
                
            }
            else {
                cnt++;
                sum=0;
                sum=weights[i];
            }
        }
return cnt;

    }
}