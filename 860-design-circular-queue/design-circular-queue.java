class MyCircularQueue {
    int[] arr;
    int size, f, r;
    public MyCircularQueue(int k) {
        arr = new int[k];
        size = k;
        f = -1;
        r = -1;
    }
    
    public boolean enQueue(int value) {
        if((f == 0 && r == size-1) || f-1 == r) return false;
        if(f == -1) {
            f = 0; r = 0;
        } else {
            r = (r+1) % size;
        }
        arr[r] = value;
        return true;
    }
    
    public boolean deQueue() {
        if(f == -1) return false;
        if(f == r) {
            f = -1; r = -1;
        } else if(f == size-1) {
            f = 0;
        } else f = (f+1) % size;
        return true;
    }
    
    public int Front() {
        if(f == -1) return f;
        return arr[f];
    }
    
    public int Rear() {
        if(f == -1) return f;
        return arr[r];
    }
    
    public boolean isEmpty() {
        return f == -1 ? true : false;
    }
    
    public boolean isFull() {
        return  ((f== 0 && r == size-1) || f-1 == r)  ? true : false;
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