class MyCircularDeque {
    class Node {
        int val;
        Node next;
        Node prev;
        Node(int v) {
            this.val = v;
        }
    }
    int cap = 0;
    int size = 0;
    Node head = null;
    Node tail = null;
    public MyCircularDeque(int k) {
        size = 0;
        cap = k;
    }
    
    public boolean insertFront(int value) {
        if(size == cap) return false;
        Node newNode = new Node(value);
        if(head == null) {
            head = newNode;
            tail = newNode;
            head.next = tail;
            head.prev = tail;
            tail.prev = head;
            tail.next = head;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
            head.prev = tail;
        }
        size++;
        return true;
    }
    
    public boolean insertLast(int value) {
        if(size == cap) return false;
        Node newNode = new Node(value);
        if(head == null) {
            head = newNode;
            tail = newNode;
            head.next = tail;
            head.prev = tail;
            tail.prev = head;
            tail.next = head;
        } else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
        size++;
        return true;
    }
    
    public boolean deleteFront() {
        if(size == 0) return false;
        if(head.next == head) {
            head = null;
            tail = null;
        } else {
            tail.next = head.next;
            head = head.next;
            head.prev = tail;
        }
        size--;
        return true;
    }
    
    public boolean deleteLast() {
        if(size == 0) return false;
        if(head.next == head) {
            head = null;
            tail = null;
        } else {
            head.prev = tail.prev;
            tail = tail.prev;
            tail.next = head;
        }
        size--;
        return true;
    }
    
    public int getFront() {
        if(size == 0) return -1;
        return head.val;
    }
    
    public int getRear() {
        if(size == 0) return -1;
        return tail.val;
    }
    
    public boolean isEmpty() {
        return size == 0;
    }
    
    public boolean isFull() {
        return size == cap;
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */