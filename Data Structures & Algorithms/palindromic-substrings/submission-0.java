class Solution {
    public int countSubstrings(String s) {
   
        int startlen = 0;
        int l = 0;
        int r = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            l = i;
            r = i;
            while (l >= 0 && r < n && s.charAt(l) == s.charAt(r)) {
                startlen++;
                l--;
                r++;
            }
            l = i;
            r = i
                + 1;

                while (l >= 0 && r < n && s.charAt(l) == s.charAt(r)) {
               startlen++;
                l--;
                r++;
            }
        }
        return startlen;
    }
}
