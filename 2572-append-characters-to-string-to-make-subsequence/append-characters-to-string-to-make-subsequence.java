class Solution {
    public int appendCharacters(String s, String t) {
        if(s.indexOf(t) != -1) return 0;
        int i = 0, j = 0;
        // while(i < s.length() && s.charAt(i) != t.charAt(0)) {
        //     i++;
        // }
        // while(i < s.length() && s.charAt(i) == t.charAt(j)) {
        //     i++;
        //     j++;
        // }
        // return t.length()-j;
        while(i < s.length() && j < t.length()) {
            if(s.charAt(i) != t.charAt(j)) i++;
            else {
                i++;
                j++;
            }
        }
        return t.length()-j;
    }
}