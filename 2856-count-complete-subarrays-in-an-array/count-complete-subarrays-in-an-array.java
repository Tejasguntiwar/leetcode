class Solution {
    public int countCompleteSubarrays(int[] nums) {
        // int c = 0;
        // HashSet<Integer> set = new HashSet<>();
        // for(int i : nums) {
        //     set.add(i);
        // }
        // int n = set.size();
        // HashSet<Integer> set2 = new HashSet<>();
        // int l = 0, r = 0;
        // while(r<nums.length) {
        //     set2.add(nums[r]);
        //     if(set2.size() == n) {
        //         c++;
        //         l++;
        //     }
        //     r++;
        // }
        // return c;
        int c = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int i : nums) {
            set.add(i);
        }
        int n = set.size();
        System.out.println(n);
        set.clear();
        for(int i = 0; i<nums.length; i++) {
            for(int j = i; j<nums.length; j++) {
                set.add(nums[j]);
                if(set.size() == n) {
                    c++;
                    // break;
                }
            }
            set.clear();
        }
        return c;
    }
}