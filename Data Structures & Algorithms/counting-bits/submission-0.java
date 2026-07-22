class Solution {
    public int[] countBits(int n) {
int[] dp=new int[n+1];
int powertwo=1;

for(int i=1;i<=n;i++){
    if(i%2==0) powertwo=i;
    dp[i]=1+dp[i-powertwo];
}
return dp;


    }
}
