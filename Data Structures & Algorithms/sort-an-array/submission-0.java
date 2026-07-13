class Solution {
    public int[] sortArray(int[] nums) {
        Divid(nums, 0, nums.length - 1);
        return nums;
    }

    public static void Divid(int[] nums, int s, int e) {
        if (s >= e)
            return;

        int mid = s + (e - s) / 2;
        Divid(nums, s, mid);
        Divid(nums, mid + 1, e);
        MergeTwoSortedArray(nums, s, mid, e);
    }

    public static void MergeTwoSortedArray(int[] nums, int low, int mid, int high) {
        int left = low;
        int right = mid + 1;
        ArrayList<Integer> list = new ArrayList<>();
        while (left <= mid && right <= high) {
            if (nums[left] <= nums[right]) {
                list.add(nums[left]);
                left++;
            } else {
                list.add(nums[right]);
                right++;
            }
        }
        while (left <= mid) {
            list.add(nums[left]);
            left++;
        }
        while (right <= high) {
            list.add(nums[right]);
            right++;
        }
        for (int i = low; i <= high; i++) {
            nums[i] = list.get(i - low);
        }
    }
}