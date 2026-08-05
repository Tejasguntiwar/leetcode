class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] n2 = new int[n];
        int p = 0, nv = 0;
        int i = 0, j = 1;
        while(i < n && p < n) {
            if(nums[p] >=0) {
                n2[i] = nums[p];
                i+=2;
            }
            p++;
        }
        while(j < n && nv < n) {
            if(nums[nv] <0) {
                n2[j] = nums[nv];
                j+=2;
            }
            nv++;
        }
        return n2;
    }
}