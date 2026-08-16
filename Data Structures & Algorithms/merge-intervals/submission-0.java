class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        List<int[]> list = new ArrayList<>();
        int[] first = intervals[0];
        list.add(first);
        for (int i = 1; i < intervals.length; i++) {
            int[] firstval = list.get(list.size()-1);
            int[] secondval = intervals[i];
            if (secondval[0] >= firstval[0] && secondval[0] <= firstval[1]) {
                int min = Math.min(firstval[0], secondval[0]);
                int max = Math.max(firstval[1], secondval[1]);
                int[] ans = new int[2];
                firstval[0]=min;
                firstval[1]=max;
            } else {
                list.add(secondval);
            }
        }

        int size=list.size();
        int[][] result=new int[size][2];

        for(int i=0;i<size;i++){
            result[i]=list.get(i);
        }
        return result;
    }
}
