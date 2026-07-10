class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        int minlength = Math.min(n, m);

        int s1 = 0;
        int s2 = 0;
        boolean flag = true;
        StringBuilder str = new StringBuilder("");
        while (s1 < minlength && s2 < minlength) {
            if (flag) {
                str.append(word1.charAt(s1));
                s1++;
            } else {
                str.append(word2.charAt(s2));
                s2++;
            }
            flag = !flag;
        }

        while(s1<n){
            str.append(word1.charAt(s1));
                s1++;
        }
        while(s2<m){
            str.append(word2.charAt(s2));
                s2++;
        }
        return str.toString();
    }
}