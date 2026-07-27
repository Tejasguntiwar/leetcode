// class Solution {
//     public int removeDuplicates(int[] nums) {
        
//         //Worst complexity
        
//         Set<Integer> set = new LinkedHashSet<>();
//         int i = 0;
//         for (int n : nums) {
//             if(set.add(n)) nums[i++] = n;
//         }
//         return set.size();
//     }
// }
// class Solution {
//     public int removeDuplicates(int[] nums) {
//         int k = 0;
//         HashMap<Integer, Integer> map = new HashMap<>();
//         for(int i = 0; i < nums.length; i++) {
//             if(map.get(nums[i]) == null) {
//                 map.put(nums[i], 1);
//                 nums[k++] = nums[i];
//             }
//         }
//         return map.size();
//     }
// }
class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 0;
        for(int i = 1; i < nums.length; i++) {
            if(nums[k] != nums[i]) {
                nums[++k] = nums[i];
            }
        }
        return k+1;
    }
}