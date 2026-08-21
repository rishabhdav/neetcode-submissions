class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] ans = new int[n - k + 1];
        int i = 0;
        Deque<Integer> dq = new ArrayDeque<>();

        int l = 0;
        int r = 0;
        while (r < n) {
            while (!dq.isEmpty() && nums[dq.peekLast()] <= nums[r]) {
                dq.pollLast();
            }
            dq.addLast(r);

            if (r - l + 1 < k) {
                r++;
            } else if (r - l + 1 == k) {
                if (dq.isEmpty()) {
                    ans[i++] = 0;
                } else {
                    ans[i++] = nums[dq.peekFirst()];

                    if (dq.peekFirst() == l) {
                        dq.pollFirst();
                    }
                    l++;
                    r++;
                }
            }
        }
        return ans;
    }
}
