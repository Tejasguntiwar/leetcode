class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int minI = -1, maxI=-1;
        for (int i = 0; i < n; i++) {
            if (nums[i] < min) {
                min = nums[i];
                minI = i;
            }
            if (nums[i] > max) {
                max = nums[i]; // Keeps track of true max
                maxI = i;
            }
        }
        int left = Math.min(minI,maxI);
        int right = Math.max(minI,maxI);
        // if(left <= n/2 && right <= n/2) {
        //     return right+1;
        // } else if(left>n/2 && right>n/2) {
        //     return n-left;
        // } else {
        //     int delleft = left+1;
        //     int delright = n-right;
        //     return delleft+delright;
        // }
        int delleft = right+1;
        int delright = n-left;
        int delboth = (left+1)+(n-right);
        return Math.min(delboth, Math.min(delleft, delright));
        // int c = 0;
        // if(minI < n/2) {
        //     c++;
        // }
        // if(maxI < n/2) {
        //     c++;
        // }
        // int rem;
        // if(c == 2) {//left
        //     return rem = Math.max(minI,maxI) + 1;
        //     // System.out.println(rem);
        // } else if(c == 0) {//right
        //     return rem = n - Math.min(minI,maxI);
        //     // System.out.println(rem);
        // }
        // int delleft = Math.max(minI,maxI)+1;
        // int delright = (n - Math.min(minI,maxI))+1;
        // return delleft + delright;
    }
}