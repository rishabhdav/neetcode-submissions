class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();
        int i = 0;

        int count = nums.length / 3 + 1;
        while (i < nums.length) {
            int cnt = 0;
            int j = i;
            while (j < nums.length && nums[i] == nums[j]) {
                j++;
                cnt++;
            }

            if (cnt >= count)
                list.add(nums[i]);
            i = j;
        }
        return list;
    }
}