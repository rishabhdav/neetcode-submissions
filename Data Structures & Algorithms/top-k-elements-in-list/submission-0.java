class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] ans = new int[k];
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                int cnt = map.get(nums[i]);
                cnt++;
                map.put(nums[i], cnt);
            } else
                map.put(nums[i], 1);
        }
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> b[1] - a[1]);
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            pq.add(new int[]{entry.getKey(), map.get(entry.getKey())});
        }
        for (int i = 0; i < k; i++) {
            int[] arr1 = pq.poll();
            ans[i] = arr1[0];
        }
        return ans;
    }
}
