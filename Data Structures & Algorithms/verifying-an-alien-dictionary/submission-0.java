class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        Map<Character,Integer>map=new HashMap<>();
        int idx=0;
        for(int  i=0;i<order.length();i++){
            map.put(order.charAt(i),idx++);
        }

        for(int  k=0;k<words.length-1;k++){
            String word1=words[k];
            String word2=words[k+1];
            int j= Math.min(word1.length(),word2.length());
            int  pointer=0;
            while(pointer<j){
                char a1=word1.charAt(pointer);
                char a2=word2.charAt(pointer);
                if(a1==a2) {
                    pointer++;
                }
                else{
                    if(map.get(a1)>map.get(a2)){
                     return false;
                    }
                    else break;
                }
            }
if(pointer == word2.length() && word1.length() > word2.length())
    return false;
        }

        
        return true;
    }

}