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
class Pair {
    int x;
    int y;
    Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
class Solution {
    public int minMeetingRooms(List<Interval> intervals) {
        int n=intervals.size();
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> a.y - b.y);
        for (int i = 0; i < n; i++) {
            Interval it = intervals.get(i);
            pq.add(new Pair(it.start, it.end));
        }

        Pair p1 = pq.poll();
        int freetime = p1.y;
        int cnt = 1;
        while (!pq.isEmpty()) {
            Pair p2 = pq.poll();
            if (freetime < p2.x) {
                cnt++;
                freetime = p2.y;
            }
        }
        return 1+n-cnt;
    }
}
