class Solution {
    public int lastStoneWeight(int[] stones) {
        int n=stones.length;
        if(n==1) return stones[0];
        Arrays.sort(stones);
        int t=0;
        int first=stones[n-1];
        int second=stones[n-2];
        t=Math.abs(first-second);

        for(int i=n-3;i>=0;i--){
            t=Math.abs(t-stones[i]);
        }
        return t;
    }
}
