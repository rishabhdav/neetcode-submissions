class Solution {
    public int[] plusOne(int[] digits) {
        int carry=1;
        int n=digits.length;
        for(int i=n-1;i>=0;i--){
            int sum=carry+digits[i];
            digits[i]=sum%10;
            carry=sum/10;


        }

        if(carry!=0){
            int[] newdigits=new int[n+1];
            newdigits[0]=carry;
            for(int i=0;i<n;i++){
                newdigits[i+1]=digits[i];
            }
            return newdigits;
        }
        return digits;
    }
}
