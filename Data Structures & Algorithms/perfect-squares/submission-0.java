class Solution {
    public int numSquares(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i * i <=n; i++) {
            list.add(i * i);
        }
        return SolveIt(list, list.size() - 1, n);
    }
    public static int SolveIt(ArrayList<Integer> list, int idx, int target) {
        if (target == 0)
            return 0;
        if (idx == 0) {
            return target%list.get(idx) == 0 ? target/list.get(idx) : 0;
        }

        int notpick = SolveIt(list, idx - 1, target);
        int pick = Integer.MAX_VALUE;
        if (list.get(idx) <= target) {
            pick = 1 + SolveIt(list, idx, target - list.get(idx));
        }
        return Math.min(pick, notpick);
    }
}