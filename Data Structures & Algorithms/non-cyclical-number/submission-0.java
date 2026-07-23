class Solution {
    public boolean isHappy(int n) {
        int slow=n;
        int fast=getNumber(n);
        while(slow!=fast){
            slow=getNumber(slow);
            fast=getNumber(getNumber(fast));}
            slow=n;
            while(slow!=fast){
                slow=getNumber(n);
                fast=getNumber(n);
            }
            return slow==1;
        
    }
    public static int getNumber(int n){
        int sum=0;
        while(n>0){
            int digit=n%10;
            sum=sum*10+digit*digit;
            n=n/10;
        }
        return sum;
    }
}
