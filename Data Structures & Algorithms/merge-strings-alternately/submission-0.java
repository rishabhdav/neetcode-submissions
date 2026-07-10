class Solution {
    public String mergeAlternately(String word1, String word2) {
        if(word1.length()>word2.length()) return mergeAlternately(word2,word1);
        int minlength=word1.length();

        boolean flag=true;

        int s1=0;
        int  s2=0;
StringBuilder str=new StringBuilder("");
        while(s1<=minlength&&s2<minlength){
            if(flag){
                str.append(word1.charAt(s1)) ;
                s1++;
            
            }
            else {
                 str.append(word2.charAt(s2)) ;
                s2++;
            }
            flag=!flag;

        }
        while(s2<word2.length()){
            str.append(word2.charAt(s2));
            s2++;
        }
        return str.toString();
    }
}