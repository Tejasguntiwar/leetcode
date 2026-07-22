class Solution {
    public int[] getFinalState(int[] nums, int k, int m) {
        for(int i = 0; i < k; i++) {
            int small = 0;
            for(int j = 1; j < nums.length; j++) {
                if(nums[small]>nums[j]) small = j;
            }
            nums[small] *= m;
        }
        return nums;
    }
}