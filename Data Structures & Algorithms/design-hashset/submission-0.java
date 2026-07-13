class MyHashSet {
 boolean[] hashMap=new boolean[1000001];
    public MyHashSet() {
       
    }
    
    public void add(int key) {

        this.hashMap[key]=true;
    }
    
    public void remove(int key) {
        this.hashMap[key]=false;
        
    }
    
    public boolean contains(int key) {
        return this.hashMap[key];
        
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */