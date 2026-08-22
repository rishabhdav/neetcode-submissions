
class Pair {
    String str;
    int level;

    Pair(String str, int level) {
        this.str = str;
        this.level = level;
    }
}
class Solution {
    public int openLock(String[] deadends, String target) {
        Set<String> visited = new HashSet<>();
        for (int i = 0; i < deadends.length; i++) {
            visited.add(deadends[i]);
        }
        Queue<Pair> pq = new LinkedList<>();

        pq.add(new Pair("0000", 0));
        visited.add("0000");

        while (!pq.isEmpty()) {
            Pair p1 = pq.poll();
            if (p1.str.equals(target))
                return p1.level;
           

            for (int i = 0; i < 4; i++) {
                 StringBuilder postr = new StringBuilder(p1.str);
            StringBuilder negstr = new StringBuilder(p1.str);
                int val = p1.str.charAt(i) - '0';
                int postval = (val + 1) % 10;
                int negval = (val + 9) % 10;

                postr.setCharAt(i, (char) (postval + '0'));
                negstr.setCharAt(i, (char) (negval + '0'));

                if(!visited.contains(postr.toString())){
                    visited.add(postr.toString());
                    pq.add(new Pair(postr.toString(),p1.level+1));
                }
                 if(!visited.contains(negstr.toString())){
                    visited.add(negstr.toString());
                    pq.add(new Pair(negstr.toString(),p1.level+1));
                }
            }
        }
        return -1;
    }
}