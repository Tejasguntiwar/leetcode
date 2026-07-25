// class LRUCache {
//     LinkedHashMap<Integer, Integer> map;
//     int initCap;
//     int currCap;
//     // int first;
//     public LRUCache(int capacity) {
//         map = new LinkedHashMap<>();
//         initCap = capacity;
//         currCap = 0; 
//     }
    
//     public int get(int key) {
//         if(map.get(key) == null)
//         return -1; 
//         else {
//             int n = map.remove(key);
//             map.put(key, n);
//             return n;
//         }
//         // return map.get(key);  
//     }
    
//     public void put(int key, int value) {
//         // if(currCap == 0) first = key;
//         if(map.get(key) == null)
//         currCap++;
//         map.put(key,value);
//         if(currCap > initCap) {
//             Iterator<Map.Entry<Integer, Integer>> it = map.entrySet().iterator();
//             while (it.hasNext()) {
//                 it.next();
//                 it.remove();
//                 break;
//                 // System.out.println(entry.getKey() + " = " + entry.getValue());
//             }
//             currCap--;
//         }
//     }
// }

class LRUCache {
    LinkedHashMap<Integer, Integer> map;
    int initSize;
    // The load factor is a measure that decides when a hash-based collection (like HashMap or LinkedHashMap) should grow larger to prevent performance slowdowns
    public LRUCache(int capacity) {
        // map = new LinkedHashMap<>(capacity, load factor, true (turns on LRU access order!));
        map = new LinkedHashMap<>(capacity, 0.75f, true);
        initSize = capacity;
    }
    
    public int get(int key) {
        return map.getOrDefault(key, -1);
    }
    
    public void put(int key, int value) {
        map.put(key,value);
        if(map.size() > initSize) {
            Iterator<Map.Entry<Integer, Integer>> it = map.entrySet().iterator();
            if(it.hasNext()) {
                it.next();
                it.remove();
            }
        }
    }
}
/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */