class Solution {
    public int minOperations(int[] nums, int k) {
        int sum=0;
        for(int n=0;n<nums.length;n++) {
            sum+=nums[n];
        }return sum%k;
    }
}