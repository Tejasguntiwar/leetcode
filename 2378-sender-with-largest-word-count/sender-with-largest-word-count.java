class Solution {
    public String largestWordCount(String[] msg, String[] sen) {
        TreeMap<String, Integer> map = new TreeMap<>();
        int max = Integer.MIN_VALUE;
        String maxName = "";
        for(int i =0;i < msg.length; i++) {
            map.put(sen[i], map.getOrDefault(sen[i], 0) + msg[i].split(" ").length);
        }
        for(String str : map.keySet()) {
            if(max <= map.get(str)) {
                max = map.get(str);
                maxName = str;
            }
        }
        return maxName;
    }
}