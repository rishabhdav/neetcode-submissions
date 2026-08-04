class Solution {
    public int numDecodings(String s) {
        return SolveIt(0, s);
    }
    public static int SolveIt(int idx, String s) {
        if (idx == s.length())
            return 1;
        if (s.charAt(idx) == '0')
            return 0;

        int onestep = SolveIt(idx + 1, s);
        int twostep = 0;
     if(idx<s.length()-1){
           if (s.charAt(idx) == '1' || (s.charAt(idx) == '2' && s.charAt(idx+1) <= '6')) {
            twostep = SolveIt(idx + 2, s);
        }
     }
        return onestep + twostep;
    }
}
