class Solution {
    private boolean isPalin(String s) {
        int i =0, j = s.length()-1;
        while(i<j) {
            if(s.charAt(i)!= s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    } 
    public String longestPalindrome(String s) {
        String palin = "";
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < s.length(); i++) {
            for(int j = i; j < s.length(); j++) {
                String sub = s.substring(i,j+1);
                if(sub.length() > max && isPalin(sub)) {
                    palin = sub;
                    max = sub.length();
                }
            }
        }
        return palin;
    }
}