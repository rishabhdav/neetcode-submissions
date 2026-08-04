class Solution {
    public String longestPalindrome(String s) {
        int len = 0;
        int startlen = 0;
        int l = 0;
        int r = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            l = i;
            r = i;
            while (l >= 0 && r < n && s.charAt(l) == s.charAt(r)) {
                if (len < r - l + 1) {
                    startlen = l;
                    len = r - l + 1;
                }
                l--;
                r++;
            }
            l = i;
            r = i
                + 1;

                while (l >= 0 && r < n && s.charAt(l) == s.charAt(r)) {
                if (len < r - l + 1) {
                    startlen = l;
                    len = r - l + 1;
                }
                l--;
                r++;
            }
        }
        return s.substring(startlen,startlen+len);
    }
}
