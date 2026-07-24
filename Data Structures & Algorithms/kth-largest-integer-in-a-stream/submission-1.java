class KthLargest {
    PriorityQueue<Integer>pq;
    int k;

    public KthLargest(int k, int[] nums) {
        this.k=k;
        this.pq=new PriorityQueue<>();
        for(Integer it:nums){
            pq.add(it);
            while(pq.size()>k) pq.poll();
        }
       
        
    }
    
    public int add(int val) {
       pq.add(val);
       while(pq.size()>k){
        pq.poll();
       }
       return pq.peek();
        
    }
}
