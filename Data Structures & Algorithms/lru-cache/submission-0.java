class DListNode{
    int val;
    int key;
    DListNode prev;
    DListNode next;
    DListNode(int key,int val){
        this.val=val;
        this.key=key;
    }
}

class LRUCache {
    int cap;
    Map<Integer,DListNode>map;
    DListNode left;
    DListNode right;
    

    public LRUCache(int capacity) {
        this.cap=capacity;
        this.map=new HashMap<>();
        this.left=new DListNode(-1,-1);
        this.right=new DListNode(-1,-1);
        this.left.next=this.right;
        this.right.prev=this.left;
        
    }
    public void Delete(DListNode node){
      
       DListNode curr=node.prev;
       curr.next=node.next;
       node.next.prev=curr;
       node.prev=null;
       node.next=null;
    }

    public void insert(DListNode node){

         DListNode curr=this.right.prev;
         curr.next=node;
         node.prev=curr;
         node.next=right;
         right.prev=node;
    }
    
    public int get(int key) {
        if(map.containsKey(key)){
         Delete(map.get(key));
         insert(map.get(key));
         return map.get(key).val;

        }
        return -1;
        
    }
    
    public void put(int key, int value) {
     DListNode node=new  DListNode(key,value);

        if(map.containsKey(key)){
          
           Delete(map.get(key));
            map.remove(key);
            map.put(key,node);
            insert(node);
            return;

        }

      
        if(map.size()<this.cap){
            map.remove(this.left.next.key);
            map.put(key,node);
            insert(node);
            this.cap++;
            return;
        }


        
    }
}
