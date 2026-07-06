// class Solution {
//     public int lengthOfLongestSubstring(String s) {
//         if(s.length() == 0) return 0;
//         HashSet<Character> set = new HashSet<>();
//         int l = Integer.MIN_VALUE;
//         for(int i = 0; i < s.length(); i++) {
//             int c = 0;
//             for(int j = i; j < s.length(); j++) {
//                 if(!set.add(s.charAt(j)))
//                 {
//                     break;
//                 }
//                 else c++;
//             }
//             set.clear();
//             l = Math.max(c,l);
//         }
//         return l;
//     }
// }
// class Solution {
//     public int lengthOfLongestSubstring(String s) {
//         if(s.length() == 0) return 0;
//         int l = 0, r = 0;
//         int max = Integer.MIN_VALUE;
//         int ch[] = new int[256];
//         Arrays.fill(ch,-1);
//         while(r<s.length()) {
//             char c = s.charAt(r);
//             if(ch[c] != -1 && l <= ch[c]) {
//                 l = ch[c]+1;
//                 ch[c] = r++;
//             }
//             else {
//                 ch[c] = r;
//                 max = Math.max(max,r-l+1);
//                 r++;
//             }
//         }
//         return max;
//     }
// }
// class Solution {
//     public int lengthOfLongestSubstring(String s) {
//         if(s.length() == 0) return 0;
//         // HashMap<Character, Integer> map = new HashMap<>();
//         int[] map = new int[256];
//         Arrays.fill(map,-1);
//         int len = Integer.MIN_VALUE;
//         int l = 0, r = 0;
//         while(r < s.length()) {
//             char ch = s.charAt(r);
//             if(map[ch] != -1) {
//                 if(map[ch] >= l) {
//                     l = map[ch]+1;
//                     // map.put(ch, r);
//                 }
//             }  
//             len = Math.max(len,r-l+1);
//             map[ch] = r;
//             r++;
//         }
//         return len;
//     }
// }
class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0) return 0;
        int left = 0, max = Integer.MIN_VALUE;
        HashMap<Character, Integer> map = new HashMap<>();
        for(int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            if(map.containsKey(ch) && map.get(ch) >= left) {
                left = map.get(ch)+ 1;
            }
            map.put(ch,right);
            max = Math.max(max, right-left+1);
        }
        return max;
    }
}