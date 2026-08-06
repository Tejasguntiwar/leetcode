
// class Solution {
//     public void moveZeroes(int[] nums) {
//         int n = nums.length;

//         int left = 0, right = 0;

//         while(right < n) {
             
//              while(right < n && nums[right] == 0) {
//                 // System.out.println(right);
//                 right++;
//              }
//              if(right >= n) return;
//              System.out.println(left + " : " + right);
//              swap(nums, left, right);
//              left++;
//              right++;
//         }
//         // System.out.println(Arrays.toString(nums));
//     }
//     private void swap(int[] nums, int index1, int index2) {
//         int temp = nums[index1];
//         nums[index1] = nums[index2];
//         nums[index2] = temp;
//     }
// }

class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;

        int left = 0, right = 0;

        while(right < n) {
            while(right < n && nums[right] == 0) right++;

            if(right==n) break;

            swap(nums, left , right);
            left++;
            right++;
        }
    }
    private void swap(int[] nums, int index1, int index2) {
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }
}