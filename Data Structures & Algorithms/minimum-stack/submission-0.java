class Pair{
    int x;
    int y;
    Pair(int x,int y){
        this.x=x;
        this.y=y;
    }
}

class MinStack {
    Stack<Pair>st;


    public MinStack() {
        this.st=new Stack<>();
        
    }
    
    public void push(int val) {
        if(this.st.isEmpty()){
            st.push(new Pair(val,val));
        }
        else{
            Pair newval=st.peek();
            st.push(new Pair(val,Math.min(val,newval.y)));
        }
        
    }
    
    public void pop() {
        st.pop();
        
    }
    
    public int top() {
        return st.peek().x;
        
    }
    
    public int getMin() {
        return st.peek().y;
        
    }
}
