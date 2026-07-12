class Solution {
    public int countCompleteSubarrays(int[] nums) {
        // int c = 0;
        // HashSet<Integer> set = new HashSet<>();
        // for(int i : nums) {
        //     set.add(i);
        // }
        // int n = set.size();
        // HashMap<Integer,Integer> map = new HashMap<>();
        // int l = 0, r = 0;
        // while(r<nums.length && l < nums.length) {
        //     // if(map.get(l) == map.get(r)) l++;
        //     map.put(nums[r], r);
        //     if(map.size() == n) {
        //         c+=nums.length-r;
        //         if(map.get(nums[l]) == l) {
        //             map.remove(nums[l]);
        //             l++;
        //         }
        //         // continue;
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
        HashMap<Integer,Integer> map = new HashMap<>();
        int l = 0, r = 0;
        while(r<nums.length && l < nums.length) {
            map.put(nums[r], r);
            if(map.size() == n) {
                while(map.get(nums[l]) > l) {
                    l++;
                }
                c+=(l+1);
            }
            r++;
        }
        return c;
        // int c = 0;
        // HashSet<Integer> set = new HashSet<>();
        // for(int i : nums) {
        //     set.add(i);
        // }
        // int n = set.size();
        // System.out.println(n);
        // set.clear();
        // for(int i = 0; i<nums.length; i++) {
        //     for(int j = i; j<nums.length; j++) {
        //         set.add(nums[j]);
        //         if(set.size() == n) {
        //             c++;
        //             // break;
        //         }
        //     }
        //     set.clear();
        // }
        // return c;
    }
}