class MyQueue {
public:
    stack<int>s1;
    stack<int>s2;
     int front;

    MyQueue() {
        front=0;
    }
    
    void push(int x) {
        if(s1.empty())
        front=x;

        s1.push(x);
    }
    
    int pop() {
        
      while(!s1.empty())
      {
        int x1=s1.top();
        s2.push(x1);
        s1.pop();
      }

       int toper=s2.top();
       s2.pop();

       while(!s2.empty())
       {
             if(s1.empty())
             {
                front=s2.top();
             }

          s1.push(s2.top());
          s2.pop();

       }


return toper;




    }
    
    int peek() {
         return front;
    }
    
    bool empty() {
        return s1.size()==0;
    }
};

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue* obj = new MyQueue();
 * obj->push(x);
 * int param_2 = obj->pop();
 * int param_3 = obj->peek();
 * bool param_4 = obj->empty();
 */