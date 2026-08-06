// class Solution {
//     public String longestCommonPrefix(String[] strs) {
//         int i = 0, len = Integer.MAX_VALUE;

//         for(int j = 0; j < strs.length; j++) {
//             if(strs[j].length() < len) len = strs[j].length();
//         }
//         String str = "";
//         while(i < len) {
//             char curr = strs[0].charAt(i);
//             boolean c = true;
//             for(int j = 1; j < strs.length; j++) {
//                 if(strs[j].charAt(i) != curr) c = false; 
//             }
//             if(!c) break;

//             str += strs[0].substring(i,i+1);
//             i++;
//         }
//         return str;
//     }
// }
class Solution {
    public String longestCommonPrefix(String[] strs) {
        for(int i = 0; i< strs[0].length(); i++) {
            char c = strs[0].charAt(i);
            for(int j = 1; j < strs.length; j++) {
                if(i==strs[j].length() || c != strs[j].charAt(i)) return strs[0].substring(0,i);
            }
        }
        return strs[0];
    }
}