class Pair{
    String st;
    int level;
    Pair(String st,int level){
        this.st=st;
        this.level=level;
    }
}

class Solution {
    public int openLock(String[] deadends, String target) {
        Queue<Pair> q=new LinkedList<>();
        Set<String>visited=new HashSet<>();
        for(int i=0;i<deadends.length;i++){
            visited.add(deadends[i]);
        }
        q.add(new Pair("0000",0));

        while(!q.isEmpty()){
             Pair pa=q.poll();

             if(pa.st.equals(target)) return pa.level;

             for(int i=0;i<4;i++){
              int val=pa.st.charAt(i)-'0';

                StringBuilder posstr=new StringBuilder(pa.st);
               int postval=(val+1)%10;
              int  negval=(val+9)%10;
                posstr.setCharAt(i,(char)(postval+'0'));
                StringBuilder negstr=new StringBuilder(pa.st);
                negstr.setCharAt(i,(char)(negval+'0'));
                if(!visited.contains(posstr.toString())){
                    visited.add(posstr.toString());
                    q.add(new Pair(posstr.toString(),pa.level+1));
                }
                 if(!visited.contains(negstr.toString())){
                    visited.add(negstr.toString());
                    q.add(new Pair(negstr.toString(),pa.level+1));
                }
                
             }
        }
return -1;
    }
}