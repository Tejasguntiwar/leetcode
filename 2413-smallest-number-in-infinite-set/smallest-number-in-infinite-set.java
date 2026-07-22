class SmallestInfiniteSet {
    private int c;
    private PriorityQueue<Integer> q;
    private HashSet<Integer> set;
    public SmallestInfiniteSet() {
        q = new PriorityQueue<>();
        set = new HashSet<>();
        c = 1;
    }
    
    public int popSmallest() {
        if (!q.isEmpty()) {
            int smallest = q.poll();
            set.remove(smallest); // Remove from set so it can be added back later
            return smallest;
        }
        int smallest = c++;
        set.remove(smallest);
        return smallest;
        // q.add(c);
        // set.remove(c);
        // c++;
        // return q.remove();
    }
    
    public void addBack(int num) {
        if(num < c && set.add(num))
        q.add(num);
    }
}

/**
 * Your SmallestInfiniteq object will be instantiated and called as such:
 * SmallestInfiniteq obj = new SmallestInfiniteq();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */