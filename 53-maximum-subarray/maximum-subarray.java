class Solution {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int currSum = 0;           
        for(int st = 0; st < nums.length; st++) {   //O(n)
            currSum += nums[st];
            max = Math.max(max,currSum);
            if(currSum < 0) currSum = 0;
        }
        return max;

        // int max = Integer.MIN_VALUE;
        // for(int st = 0; st < nums.length; st++) {    O(n^2)
        //     int currSum = 0;           
        //     for(int end = st; end < nums.length; end++) {
        //         currSum+=nums[end];
        //         max = Math.max(currSum, max);
        //     }
        // }
        // return max;

        // int max = Integer.MIN_VALUE;
        // for(int st = 0; st < nums.length; st++) {        O(n^3)
        //     for(int end = st; end < nums.length; end++) {
        //         int currSum = 0;           
        //         for(int i = st; i <= end; i++) {
        //             currSum += nums[i];
        //         }
        //         max = Math.max(currSum, max);
        //     }
        // }
        // return max;
    }
}