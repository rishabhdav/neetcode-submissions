class Node{
    int val;
    int key;
    Node next;

    Node(int key,int val){
        this.val=val;
        this.key=key;
        this.next=null;
    }
}
class MyHashMap {
Node[] HashMap;

    public MyHashMap() {
        this.HashMap=new Node[1000];
        for(int i=0;i<1000;i++){
            HashMap[i]=new Node(-1,-1);
}

    }
    public int getKey(int key){
        return key%1000;
    }
    
    public void put(int key, int value) {
        Node node=new Node(key,value);
        Node curr=HashMap[getKey(key)];
        if(curr.next==null){
            curr.next=node;
            return;
        }
        curr=curr.next;
        Node prev=null;
        while(curr!=null){
            if(curr.key==key){
                curr.val=value;
                return;
            }
            prev=curr;
            curr=curr.next;
        }
        prev.next=node;


        
    }
    
    public int get(int key) {
        Node curr=HashMap[getKey(key)];
        if(curr.next==null) return -1;
        curr=curr.next;
        
        while(curr!=null){
            if(curr.key==key) return curr.val;
            curr=curr.next;
        }
        return -1;


        
    }
    
    public void remove(int key) {
      Node curr=HashMap[getKey(key)];  
      if(curr.next==null) return ;
      curr=curr.next;
        Node prev=HashMap[getKey(key)];
      while(curr!=null){
        if(curr.key==key){
           if(curr.next!=null){
            prev.next=curr.next;
            curr.next=null;
           }
           else{
            prev.next=null;
           }
        }
        prev=curr;
        curr=curr.next;
      }

    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */