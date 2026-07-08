class Pair{
    String x;
    int level;
    Pair(String x,int level){
        this.x=x;
        this.level=level;
    }
}

class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        
Map<String,List<String>>map=new HashMap<>();
Set<String>visited=new HashSet<>();
 for (String word : wordList) {
            for (int i = 0; i < word.length(); i++) {

                String pattern = word.substring(0, i) + "*" + word.substring(i + 1);

                if (!map.containsKey(pattern)) {
                    map.put(pattern, new ArrayList<>());
                }

                map.get(pattern).add(word);
            }
        }

        Queue<Pair>q=new LinkedList<>();
        q.add(new Pair(beginWord,1));

        visited.add(beginWord);
      while(!q.isEmpty()){
        Pair parent=q.poll();

        if(parent.x.equals(endWord)) return parent.level;

        for (int i = 0; i < parent.x.length(); i++) {
                String pattern = parent.x.substring(0, i) + "*" + parent.x.substring(i + 1);
                 
               if(map.get(pattern)!=null){
                  for(String it:map.get(pattern)){
                    if(visited.contains(it)==false){
                        visited.add(it);
                        q.add(new Pair(it,parent.level+1));
                    }
                 }
                 map.get(pattern).clear();
               }
               
            }

      }
return 0;
    }
}
