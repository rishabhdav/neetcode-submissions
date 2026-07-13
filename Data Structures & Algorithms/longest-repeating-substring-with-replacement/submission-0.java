class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character,Integer>map=new HashMap<>();
        int l=0;
        int r=0;
        int maxfreq=1;
        int res=0;
        while(r<s.length()){
            if(map.containsKey(s.charAt(r))){
                 int cnt=map.get(s.charAt(r));
                 cnt++;
                 maxfreq=Math.max(maxfreq,cnt);
                 map.put(s.charAt(r),cnt);
            }
            else map.put(s.charAt(r),1);
                
            while((r-l+1)-maxfreq>k){
                int cnt=map.get(s.charAt(l));
                cnt--;
                if(cnt==0) map.remove(s.charAt(l));
                else map.put(s.charAt(l),cnt);
                l++;
            }
            res=Math.max(res,r-l+1);
r++;
        }
        return res;
    }
}
