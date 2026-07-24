class Solution {
    public int lastStoneWeight(int[] stones) {
        if(stones.length==1) return stones[0];
        int t=0;
        int first=stones[0];
        int second=stones[1];
        t=Math.abs(first-second);

        for(int i=2;i<stones.length;i++){
            t=Math.abs(t-stones[i]);
        }
        return t;
    }
}
