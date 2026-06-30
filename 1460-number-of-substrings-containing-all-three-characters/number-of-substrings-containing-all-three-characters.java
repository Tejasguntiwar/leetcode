// class Solution {
//     public int numberOfSubstrings(String s) {
//         HashSet<Character> set = new HashSet<>();
//         int c = 0, n = s.length();

//         for(int i = 0; i < n; i++) {
//             for(int j = i; j < n; j++) {
//                 set.add(s.charAt(j));
//                 if(set.size()>=3) {
//                     c+= n-j;
//                     break;
//                 }
//             }
//             set.clear();
//         }
//         return c;
//     }
// }

class Solution {
    public int numberOfSubstrings(String s) {
        int[] count = new int[3];
        int c = 0, n = s.length(), l = 0, r = 0;

        while(r < n && l < n) {
            char ch = s.charAt(r);
            count[ch-97]++;
            while(count[0]>=1 && count[1]>=1 && count[2]>=1) {
                c+= n-r;
                count[s.charAt(l)-97]--;
                l++;
            }
            r++;
        }
        
        return c;
    }
}