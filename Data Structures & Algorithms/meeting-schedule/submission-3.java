/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */
 class Pair{
    int x;
    int y;

    Pair(int x,int y){
        this.x=x;
        this.y=y;
    }
 }

class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {
        if(intervals.size()==0) return true;
PriorityQueue<Pair>pq=new PriorityQueue<>((a,b)->a.y-b.y);

for(int i=0;i<intervals.size();i++){
    Interval it=intervals.get(i);
    pq.add(new Pair(it.start,it.end));
}
Pair p1=pq.poll();
int freetime=p1.y;
int cnt=1;
while(!pq.isEmpty()){
    Pair p2=pq.poll();
    if(p2.x>=freetime){
        cnt++;
        freetime=p2.y;
    }
}
int n=intervals.size();
return cnt==n?true:false;



    }
}
