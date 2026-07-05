class Solution {
    public String longestCommonPrefix(String[] strs) {
           Arrays.sort(strs);
        StringBuilder str=new StringBuilder("");
        String first=strs[0];
        String lastone=strs[strs.length-1];
        for(int i=0;i<Math.min(first.length(),lastone.length());i++){
            if(first.charAt(i)!=lastone.charAt(i)) return str.toString();
            else str.append(first.charAt(i));

        }
        
        return str.toString();
    }
}