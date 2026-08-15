class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {

        List<int[]> list = new ArrayList<>();

        int i = 0;
        int n = intervals.length;

     
        while (i < n && intervals[i][1] < newInterval[0]) {
            list.add(intervals[i]);
            i++;
        }

     
        int min = newInterval[0];
        int max = newInterval[1];

        while (i < n && intervals[i][0] <= max) {
            min = Math.min(intervals[i][0], min);
            max = Math.max(intervals[i][1], max);
            i++;
        }

        int[] ans = new int[2];
        ans[0] = min;
        ans[1] = max;

        list.add(ans);

       
        while (i < n) {
            list.add(intervals[i]);
            i++;
        }

        int[][] ans1 = new int[list.size()][2];

        for (int j = 0; j < list.size(); j++) {
            ans1[j] = list.get(j);
        }

        return ans1;
    }
}