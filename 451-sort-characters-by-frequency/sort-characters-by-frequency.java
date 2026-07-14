class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        PriorityQueue<Map.Entry<Character, Integer>> q = new PriorityQueue<>(
             (a, b) -> b.getValue().compareTo(a.getValue())
        );
        for(char c : s.toCharArray()) map.put(c, map.getOrDefault(c,0) + 1);
        // for(Map.Entry<Character, Integer> en: map.entrySet()) {
        //     System.out.println(en.getKey() + " " + en.getValue());
        // }
        for(Map.Entry<Character, Integer> en: map.entrySet()) {
            q.add(en);
        }
        StringBuilder sb = new StringBuilder("");
        while(!q.isEmpty()) {
            Map.Entry<Character, Integer> entry = q.remove();
            int count = entry.getValue();
            char ch = entry.getKey();
            while(count>=1) {
                sb.append(ch);
                count--;
            }
        }
        return sb.toString();
    }
}