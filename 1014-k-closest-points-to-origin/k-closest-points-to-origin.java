class Solution {
    public int[][] kClosest(int[][] points, int k) {
        int  n= points.length;
        // PriorityQueue<Double> q = new PriorityQueue<>(
        //     (a,b) ->Double.compare(a, b)
        // );
        // PriorityQueue<Integer> q = new PriorityQueue<>(
        //     (idx1,idx2) -> {
        //         int dist1 = points[idx1][0] * points[idx1][0] + points[idx1][1] * points[idx1][1];
        //         int dist2 = points[idx2][0] * points[idx2][0] + points[idx2][1] * points[idx2][1];
        //         return Integer.compare(dist1,dist2);
        //     }
        // );
        
        //OR
        
        PriorityQueue<int[]> q = new PriorityQueue<>(
            (p1,p2) -> {
                int dist1 = p1[0] * p1[0] + p1[1] * p1[1];
                int dist2 = p2[0] * p2[0] + p2[1] * p2[1];
                return Integer.compare(dist1,dist2);
            }
        );
        HashMap<Double, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++) {
            // int n1diff = points[i][0] * points[i][0];
            // int n2diff = points[i][1] * points[i][1];
            // double sqrt = Math.sqrt(n1diff + n2diff);
            // q.add(sqrt);
            // q.add(i);
            q.add(points[i]);
            // map.put(sqrt, i);
        }
        int[][] closest = new int[k][2];
        for(int i = 0; i < k; i++) {
            // closest[i][0] = points[map.get(q.peek())][0];
            // closest[i][1] = points[map.get(q.remove())][1];
            closest[i] = q.poll();
        }
        return closest;
    }
}