// class Solution {
//     // private void addVowel(HashSet<Character> set) {
//     //     set.add('a'); set.add('e'); set.add('i'); set.add('o'); set.add('u');
//     //     set.add('A'); set.add('E');set.add('I'); set.add('O');set.add('U');
//     // }
//     private boolean isVowel(char ch) {
//         return "aeiouAEIOU".indexOf(ch) != -1;
//     }
//     public String sortVowels(String s) {
//         PriorityQueue<Character> vowels = new PriorityQueue<>(); 
        
//         // HashSet<Character> set = new HashSet<>();
//         // addVowel(set);

//         for(char ch: s.toCharArray()) {
//             // if(set.contains(ch)) vowels.add(ch);
//             if(isVowel(ch)) vowels.add(ch);
//         } 
//         StringBuilder sb = new StringBuilder("");
//         for(int i = 0; i < s.length(); i++) {
//             char ch = s.charAt(i);
//             // if(set.contains(ch)) {
//             if(isVowel(ch)) {
//                 sb.append(vowels.remove());
//             }
//             else {
//                 sb.append(ch);
//             }
//         }
//         return sb.toString();
//     }
// }
class Solution {
    private void countVowels(int[] freq, boolean[] isVowel, String s) {

        for(char ch : s.toCharArray()) {
            if("aeiouAEIOU".indexOf(ch) != -1) {
                freq[ch]++;
                isVowel[ch] = true;
            }
        }
    } 
    public String sortVowels(String s) {
        int[] countOfVowels = new int[128];
        boolean[] isVowel = new boolean[128];
        countVowels(countOfVowels, isVowel, s);

        StringBuilder sb = new StringBuilder("");
        
        int idx = 0;
        
        while(idx < 128 && countOfVowels[idx] == 0) idx++;

        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            // int ix = "aeiouAEIOU".indexOf(ch);
            if(isVowel[ch]) {                
                System.out.println((char)(idx));
                sb.append((char)(idx));
                countOfVowels[idx]--;
                while(idx < 128 && countOfVowels[idx] == 0) {
                    idx++;
                }
            } else 
                sb.append(ch);
        }
        return sb.toString();
    }
}