struct Node {
    int val;
    Node* prev;
    Node* next;
    Node(int x): val(x), prev(NULL), next(NULL) {}
};

class MyCircularDeque {
    int capacity, size;
    Node* head; 
    Node* tail; 
public:
    MyCircularDeque(int k) {
        capacity = k;
        size = 0;
        head = new Node(-1);
        tail = new Node(-1);
        head->next = tail;
        tail->prev = head;
    }

    bool insertFront(int value) {
        if (isFull()) return false;
        Node* node = new Node(value);
        node->next = head->next;
        node->prev = head;
        head->next->prev = node;
        head->next = node;
        size++;
        return true;
    }

    bool insertLast(int value) {
        if (isFull()) return false;
        Node* node = new Node(value);
        node->prev = tail->prev;
        node->next = tail;
        tail->prev->next = node;
        tail->prev = node;
        size++;
        return true;
    }

    bool deleteFront() {
        if (isEmpty()) return false;
        Node* node = head->next;
        head->next = node->next;
        node->next->prev = head;
        delete node;
        size--;
        return true;
    }

    bool deleteLast() {
        if (isEmpty()) return false;
        Node* node = tail->prev;
        tail->prev = node->prev;
        node->prev->next = tail;
        delete node;
        size--;
        return true;
    }

    int getFront() {
        if (isEmpty()) return -1;
        return head->next->val;
    }

    int getRear() {
        if (isEmpty()) return -1;
        return tail->prev->val;
    }

    bool isEmpty() { return size == 0; }
    bool isFull() { return size == capacity; }
};
