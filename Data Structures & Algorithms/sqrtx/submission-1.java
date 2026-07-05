class Solution {
    public int mySqrt(int x) {
        int s=1;
        int e=x;
        if(x==0||x==1) return x;
        int answer=-1;
        while(s<=e){
            long mid=s+(e-s)/2;
            long val=mid*mid;
            if(val<=x){
          answer=(int)mid;
         
          s=(int)mid+1; 
            }
            else{
                e=(int)mid-1;
            }
        }
        return answer;
        
    }
}