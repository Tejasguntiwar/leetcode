class Solution {
    public int minSetSize(int[] arr) {
        int n = arr.length/2;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i < arr.length; i++) {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        // PriorityQueue<Map.Entry<Integer,Integer>> pq = new PriorityQueue<>(
        //     (a,b) -> Integer.compare(b.getValue(),a.getValue())
        // );
        // OR
        PriorityQueue<Map.Entry<Integer,Integer>> pq = new PriorityQueue<>(Map.Entry.comparingByValue(Comparator.reverseOrder()));
        for(Map.Entry<Integer,Integer> en: map.entrySet()) {
            pq.add(en);
        }
        int size= 0, c = 0;
        while(!pq.isEmpty()) {
            int a = pq.remove().getValue();
            size += a;
            c++;
            if(size>= n) {
                break;
            }
        }
        return c;
    }
}