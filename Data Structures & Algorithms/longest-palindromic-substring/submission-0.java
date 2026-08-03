class Solution {
    public String longestPalindrome(String s) {
       StringBuilder str=new StringBuilder(s);
       str=str.reverse();
       String newstr=str.toString();
       int n=s.length();
       int[][] dp=new int[n+1][n+1];

       for(int i=1;i<=n;i++){
        for(int j=1;j<=n;j++){
            if(s.charAt(i-1)==newstr.charAt(j-1)){
                dp[i][j]=1+dp[i-1][j-1];
            }
            else{
                dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
       }
     StringBuilder str1=new StringBuilder();
     int i=n;
     int j=n;
     while(i>1||j>1){
        if(s.charAt(i-1)==newstr.charAt(j-1)){
            str1.insert(0,s.charAt(i-1));
            i--;
            j--;

        }
        else if(dp[i-1][j]>dp[i][j-1]){
            i--;
        }
        else j--;
     }
return str1.toString();
    }
}
