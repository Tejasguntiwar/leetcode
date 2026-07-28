// class Solution {
//     public String smallestPalindrome(String s) {
//         int n = s.length();
//         int[] arr = new int[26];
//         for(int i = 0; i < n; i++) {
//             arr[s.charAt(i) - 'a']++;
//         }
//         char[] small= new char[n];
//         int k = 0;
//         for(int i = 0; i < arr.length; i++) {
//             if(arr[i] == 0 || arr[i] == 1) continue;
//             else {
//                 while(arr[i]>1) {
//                     small[k] =ch
//                     small[n-k-1] = (char)(i + 'a');
//                     k++;
//                     arr[i]-=2;
//                 } 
//             }
//         }
//         for(int i = 0; i < arr.length; i++) {
//             if(arr[i] == 1) small[k] = (char)(i + 'a');
//         }
//         return new String(small);
//     }
// }
class Solution {

    //  same as above just few modifications

    public String smallestPalindrome(String s) {
        int n = s.length();
        int[] arr = new int[26];
        for(int i = 0; i < n; i++) {
            arr[s.charAt(i) - 'a']++;
        }
        char[] small= new char[n];
        int k = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 0) continue;
            
            char ch = (char) ( i + 'a');

            if(arr[i] % 2 != 0) {
                small[n/2] = ch;
            }

            int pairs = arr[i]/2;
            for(int j = 0; j < pairs; j++) {
                small[k] = ch;
                small[n-k-1] = ch;
                k++;
            }
        }
        
        return new String(small);
    }
}