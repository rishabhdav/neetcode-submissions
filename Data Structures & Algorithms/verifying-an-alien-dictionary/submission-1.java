class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < order.length(); i++) {
            map.put(order.charAt(i), i);
        }
        for (int j = 0; j < words.length - 1; j++) {
            String word1 = words[j];
            String word2 = words[j+1];
        
            int minlen = Math.min(word1.length(), word2.length());

            int k=0;
            while(k<minlen){

                if(map.get(word1.charAt(k))<map.get(word2.charAt(k))){
                    break;
                }
                else if(map.get(word1.charAt(k))>map.get(word2.charAt(k))){
                    return false;
                }
                else{
                k++;
                }

            }
             if (k == minlen && word1.length() > word2.length()) {
                return false;
            }
                
        }
        return true;
    }
}