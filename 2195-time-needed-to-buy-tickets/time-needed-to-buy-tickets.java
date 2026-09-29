class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int n = tickets.length;
        Queue<Integer> q = new LinkedList<>();
        int c = 0;
        for(int i = 0; i < n; i++) {
            q.add(i);            
        }
        while(!q.isEmpty()) {
            c++;
            tickets[q.peek()]--;        
            if(q.peek() == k && tickets[q.peek()] == 0) return c;
            if(tickets[q.peek()] == 0)
            q.remove();
            else q.add(q.remove());
        }
        return c;
    }
}