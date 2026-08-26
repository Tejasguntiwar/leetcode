class Solution {
    // private int[] last(int[] nums, int target) {
    //     if(nums.length == 0) return new int[] {-1,-1};
    //     if(nums.length == 1 && nums[0] == target) return new int[] {0,0};
    //     if(nums.length == 1 && nums[0] != target) return new int[] {-1,-1};
    //     int l = 0, r = nums.length-1;
    //     while(l<=r) {
    //         int mid = l +(r-l)/2;
    //         if(nums[mid] == target) {
    //             if(mid != nums.length-1 && nums[mid+1] == target) return new int[] {mid,mid+1};
    //             else if(mid != 0 && nums[mid-1] == target) return new int[] {mid-1,mid};
    //             else return new int[] {mid,mid};
    //         } else if(nums[mid] < target) l = mid+1;
    //         else r = mid-1;
    //     }
    //     return new int[] {-1,-1};
    // }
    private int last(int[] nums, int target) {
        int l = 0, r = nums.length-1, ans = -1;
        while(l<=r) {
            int mid = l +(r-l)/2;
            if(nums[mid] == target) {
                ans = mid; 
                l = mid+1;
            } else if(nums[mid] < target) l = mid+1;
            else r = mid-1;
        }
        return ans;
    }
    private int first(int[] nums, int target) {
        int l = 0, r = nums.length-1, ans = -1;
        while(l<=r) {
            int mid = l +(r-l)/2;
            if(nums[mid] == target) {
                ans = mid; 
                r = mid-1;
            } else if(nums[mid] < target) l = mid+1;
            else r = mid-1;
        }
        return ans;
    }
    public int[] searchRange(int[] nums, int target) {
        int f= first(nums, target);
        int s= last(nums, target);
        return new int[] {f,s};
    }
}