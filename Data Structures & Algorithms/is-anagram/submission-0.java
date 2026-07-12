class Solution {
    public boolean isAnagram(String s, String t) {
if(s.length()!=t.length()) return false;

Map<Character,Integer>map=new HashMap<>();

for(int i=0;i<s.length();i++){
    if(map.containsKey(s.charAt(i))){
        int freq=map.get(s.charAt(i));
        freq++;
        map.put(s.charAt(i),freq);
    }
    else map.put(s.charAt(i),1);
    
}
 for(int i=0;i<t.length();i++){
    if(map.containsKey(t.charAt(i))){
       int freq=map.get(t.charAt(i));
       freq--;
       if(freq==0) map.remove(t.charAt(i));
       else map.put(t.charAt(i),freq);

    }
    else map.put(t.charAt(i),1);
    
}
return map.isEmpty();
    }
}
