// class Solution {
//     public String largestWordCount(String[] msg, String[] sen) {
//         HashMap<String, Integer> map = new HashMap<>();
//         int max = Integer.MIN_VALUE;
//         String maxName = "";
//         for(int i =0;i < msg.length; i++) {
//             map.put(sen[i], map.getOrDefault(sen[i], 0) + msg[i].split(" ").length);
//         }
//         for(String str : map.keySet()) {
//             if(max <= map.get(str)) {
//                 max = map.get(str);
//                 maxName = str;
//             }
//         }
//         return maxName;
//     }
// }
class Solution {
    public String largestWordCount(String[] msg, String[] sen) {
        HashMap<String, Integer> map = new HashMap<>();
        int max = Integer.MIN_VALUE;
        String maxName = "";
        for(int i =0;i < msg.length; i++) {
            map.put(sen[i], map.getOrDefault(sen[i], 0) + msg[i].split(" ").length);
            if(max < map.get(sen[i])) { 
                max = map.get(sen[i]);
                maxName = sen[i];
            } 
            else if(max == map.get(sen[i])) {
                maxName = maxName.compareTo(sen[i]) < 0 ? sen[i]: maxName;
            }
        }
        // for(String str : map.keySet()) {
        //     if(max <= map.get(str)) {
        //         max = map.get(str);
        //         maxName = str;
        //     }
        // }
        return maxName;
    }
}