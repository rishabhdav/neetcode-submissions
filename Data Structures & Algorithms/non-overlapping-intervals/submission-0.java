class Pair {
    int x;
    int y;
    int idx;

    Pair(int x, int y, int idx) {
        this.x = x;
        this.y = y;
        this.idx = idx;
    }
}

class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> a.y - b.y);
        int n = intervals.length;
        for (int i = 0; i < n; i++) {
            pq.add(new Pair(intervals[i][0], intervals[i][1],i));
        }
        Pair p1 = pq.poll();
        int freetime = p1.y;
        int cnt = 1;
        while (!pq.isEmpty()) {
            Pair p2 = pq.poll();
            if (freetime <= p2.x) {
                cnt++;
                freetime = p2.y;
            }
        }
        return n-cnt;

    }
}