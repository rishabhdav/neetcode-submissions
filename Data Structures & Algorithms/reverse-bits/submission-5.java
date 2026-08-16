class Solution {
    public int reverseBits(int n) {
        int result=0;
        for(int i=0;i<32;i++){
            int newval=n>>i ;
            int bits=(newval)&1;
       
            result=result+(bits<<(31-i));
        }
        return result;
    }
}
