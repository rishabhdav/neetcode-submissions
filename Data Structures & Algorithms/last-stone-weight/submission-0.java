class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer>pq=new PriorityQueue<>((a,b)->b-a);
        for(Integer it:stones){
            pq.add(it);
        }
        int t=0;
        while(pq.size()>1){
            int first=pq.poll();
            int second=pq.poll();
            t=Math.abs(first-second);
            pq.add(t);
        }
        return pq.peek();
    }
}
