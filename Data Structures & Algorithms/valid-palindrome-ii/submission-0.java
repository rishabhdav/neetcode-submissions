class Solution {
    public boolean validPalindrome(String s) {
        int start=0;
        int end=s.length()-1;
        int cnt=0;
        while(start<=end){
            if(isSame(s.charAt(start),s.charAt(end))){
                start++;
                end--;
            }
            else{
                if(cnt<=1){
                    cnt++;
                    start++;
                    end--;
                }
                else return false;
            }
        }
        return true;


    }
    public boolean isSame(char a,char b){
        if(a>='A'&&a<='Z') a=(char)(a+32);
        if(b>='A'&&b<='Z') b=(char)(b+32);
        return a==b;
    }
}