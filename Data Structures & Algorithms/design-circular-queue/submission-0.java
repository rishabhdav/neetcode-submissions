class ListNode{
    int val;
    ListNode next;

    ListNode(int val){
        this.val=val;
        this.next=null;
    }
}

class MyCircularQueue {
    int space;
    ListNode left;
    ListNode right;


    public MyCircularQueue(int k) {
    this.space=k;
    this.left=new ListNode(0);
    this.right=this.left;
        
    }
    
    public boolean enQueue(int value) {

        if(isFull()) return false;
        ListNode newNode=new ListNode(value);
        
        this.right.next=newNode;
        right=newNode;
        space--;
        return true;
    }
    
    public boolean deQueue() {
        if(isEmpty()) return false;
         if(this.left.next.next==null) {
            this.left=null;
            right=this.left;
            space++;
            return true;
         }

         else{

            this.left.next=this.left.next.next;
            this.left.next.next=null;
            space++;
            return true;
         }

        
    }
    
    public int Front() {
        if(isEmpty()) return -1;
        return this.left.next.val;
        
    }
    
    public int Rear() {
          if(isEmpty()) return -1;
        return this.right.val;
    }
    
    public boolean isEmpty() {
        return this.left==this.right?true:false;
        
    }
    
    public boolean isFull() {
        return this.space==0?true:false;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */