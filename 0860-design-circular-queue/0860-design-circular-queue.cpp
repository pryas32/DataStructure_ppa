class MyCircularQueue {
public:

  int size;
  int count;
  int *arr;
  int front;
  int back;
   int capacity;
    MyCircularQueue(int k) {
        size=0;
        count=0;
      arr=new int[k];
        front=0;
        back=0;
        capacity=k;
    }
    
    bool enQueue(int value) {
         if(size==capacity)
         {
            return false;
         }

        count=(count+capacity);
        count=(count%capacity);
        arr[count]=value;
        count++;
        size++;
       
        back=((back+capacity));
         back=(back%capacity);
         back++;
        return true;
    }
    
    bool deQueue() {
          if(size==0)
         {
            return false;
         }
           front=(front+capacity)%capacity;
        int x2=arr[front];
        front++;
        size--;
        return true;
        




    }
    
  int Front() {
    if (size == 0) {
        return -1;
    }
    int index = (front + capacity) % capacity;
    return arr[index];
}


    
    int Rear() {
        if(size==0)
        {
            return -1;
        }
          back--;
        int x11=arr[back];
       back++;

        return x11;



    }
    
    bool isEmpty() {
        return size==0;
    }
    
    bool isFull() {
        return size==capacity;
    }
};

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue* obj = new MyCircularQueue(k);
 * bool param_1 = obj->enQueue(value);
 * bool param_2 = obj->deQueue();
 * int param_3 = obj->Front();
 * int param_4 = obj->Rear();
 * bool param_5 = obj->isEmpty();
 * bool param_6 = obj->isFull();
 */