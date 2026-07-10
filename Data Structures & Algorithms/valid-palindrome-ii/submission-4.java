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
             return ( isPalindrom(s,start+1,end)|| isPalindrom(s,start,end-1));
            }
        }
        return true;


    }
    public boolean isSame(char a,char b){
        if(a>='A'&&a<='Z') a=(char)(a+32);
        if(b>='A'&&b<='Z') b=(char)(b+32);
        return a==b;
    }
    public  boolean isPalindrom(String s,int start,int end){
        while(start<=end){
            if(!isSame(s.charAt(start),s.charAt(end))){
return false;
            }
            else{
                start++;
                end--;
            }
        }
        return true;
    }
}