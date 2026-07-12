class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String,List<String>>map=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            String  val=strs[i];
            char[] arr=val.toCharArray();
            Arrays.sort(arr);
            String finalval=new String(arr);
            if(map.containsKey(finalval)){
                List<String>list=map.get(finalval);
                list.add(strs[i]);
                map.put(finalval,list);
            }
            else {
                List<String>newlist=new ArrayList<>();
                newlist.add(strs[i]);
                map.put(finalval,newlist);
            }
        }
        List<List<String>>  ans=new ArrayList<>();
     for (Map.Entry<String, List<String>> entry : map.entrySet()) {
        ans.add(entry.getValue());

      }
      return ans;
    }
}