class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int s = Integer.MAX_VALUE;
        int e = Integer.MIN_VALUE;
        for (int i = 0; i < piles.length; i++) {
            s = 1;
            e = Math.max(e, piles[i]);
        }
      
        int ans=-1;
        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (getBananas(piles, mid) <= h) {
                ans = mid;
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return ans;
    }
    public static int getBananas(int[] piles, int rate) {
        int cnt = 0;

        for (int i = 0; i < piles.length; i++) {
            cnt = cnt + (int)Math.ceil((double)piles[i] / rate);
        }
        return cnt;
    }
}
