class Solution {
    public String smallestPalindrome(String s) {
        int n = s.length();
        int[] arr = new int[26];
        for(int i = 0; i < n; i++) {
            arr[s.charAt(i) - 'a']++;
        }
        char[] small= new char[n];
        int k = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 0 || arr[i] == 1) continue;
            else {
                while(arr[i]>1) {
                    small[k] =(char) (i + 'a');
                    small[n-k-1] = (char)(i + 'a');
                    // System.out.println(small[k] + " " + small[n-k-1]);
                    k++;
                    arr[i]-=2;
                } 
            }
        }
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 1) small[k] = (char)(i + 'a');
        }
        return new String(small);
    }
}