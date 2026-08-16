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

class Solution {
    public int minMeetingRooms(List<Interval> intervals) {
        int n = intervals.size();
        int[] st = new int[n];
        int[] end = new int[n];
        for(int i=0;i<n;i++){
            Interval it=intervals.get(i);
            st[i]=it.start;
            end[i]=it.end;
        }
        
        Arrays.sort(st);
        Arrays.sort(end);

        int i = 0;
        int j = 0;
        int cnt = 0;
        int max = 0;
        while (i < n) {
            if (st[i] < end[j]) {
                i++;
                cnt++;
            } else {
                j++;
                cnt--;
            }
            max=Math.max(cnt,max);
        }
        return max;
    }
}
