// class Solution {
//     public List<List<Integer>> threeSum(int[] nums) {
//         List<List<Integer>> list = new ArrayList<>();
//         HashSet<List<Integer>> set = new HashSet<>();

//         for(int i = 0; i<nums.length-2; i++) {
//             for(int j = i+1; j<nums.length-1; j++) {
//                 for(int k = j+1; k<nums.length; k++) {
//                     if((nums[i] + nums[j] + nums[k]) == 0) {
//                         List<Integer> l1 = new ArrayList<>();
//                         l1.add(nums[i]);
//                         l1.add(nums[j]);
//                         l1.add(nums[k]);

//                         Collections.sort(l1);

//                         // list.add(l1);
//                         set.add(l1);
//                     }
//                 }
//             }                
//         }
//         for(List<Integer> li: set) {
//             list.add(li);
//         }
//         return list;
//     }
// }

// class Solution {
//     public List<List<Integer>> threeSum(int[] nums) {
//         HashSet<List<Integer>> set = new HashSet<>();

//         for(int i = 0; i<nums.length; i++) {
//             HashSet<Integer> seen = new HashSet<>();
//             for(int j = i+1; j<nums.length; j++) {
//                 int complement = -(nums[i]+nums[j]);

//                 if(seen.contains(complement)) {
//                     List<Integer> lis = Arrays.asList(nums[i], nums[j], complement);

//                     Collections.sort(lis);

//                     set.add(lis);
//                 }
//                 seen.add(nums[j]);
//             }                
//         }
//         return new ArrayList<>(set);
//     }
// }

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        if(nums == null || n < 3) return new ArrayList<>();

        Arrays.sort(nums);
        HashSet<List<Integer>> set = new HashSet<>();
        
        for(int i = 0; i<n-2; i++) {
            int l = i+1, r = n-1;
            while(l<r) {
                int sum = nums[i] + nums[l] + nums[r];
                if(sum == 0) {
                    set.add(Arrays.asList(nums[i],nums[l],nums[r]));
                    l++;
                    r--;
                } else if(sum<0) {
                    l++;
                } else r--;
            }
        }
        return new ArrayList<>(set);
    }
}

