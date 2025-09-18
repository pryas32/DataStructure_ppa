class MyStack {
public:
queue<int>q;

    MyStack() {
        
    }
    
    void push(int x) {
        q.push(x);
    }
    
    int pop() {
           
           queue<int>s;
           while(q.size()>1)
           {
              int x1=q.front();
              q.pop();
              s.push(x1);
           }
       int lastelement=q.front();
       q.pop();

        q=s;


     return lastelement;

    }
    
    int top() {
       int x=q.back();
       return x;
    }
    
    bool empty() {
        return q.size()==0;
    }
};

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack* obj = new MyStack();
 * obj->push(x);
 * int param_2 = obj->pop();
 * int param_3 = obj->top();
 * bool param_4 = obj->empty();
 */