class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int c = 0;
        for(String str: patterns) {
            if(word.indexOf(str) != -1) c++;
        }
        return c;
    }
}