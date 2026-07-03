class Solution {
    public int search(int[] nums, int target) {
        int st = 0, end = nums.length-1;

        while(st <= end) {
            int mid = st + (end - st) / 2;

            // if(st == end) {
            //     if(nums[st] == target) return mid;
            //     else
            //     break;
            // }
            if(nums[mid] == target) return mid;

            // if(mid < nums.length && mid > 0) {
            //     if(nums[mid+1] == target) return mid+1;
            //     if(nums[mid-1] == target) return mid-1;
            // }

            // if(target < nums[mid] && nums[mid] < nums[mid+1]) st = mid+1;
            // else end = mid - 1;

            //left sorted
            if(nums[st] <= nums[mid]) {
                if(nums[st] <= target && target < nums[mid]) end = mid-1;
                else st = mid+1;
            }
            //right sorted
            // else if(nums[mid] <= nums[end]) {
            else {
                if(nums[mid] < target && target <= nums[end]) st = mid+1;
                else end = mid-1;
            }
        } 

        return -1;
    }
}