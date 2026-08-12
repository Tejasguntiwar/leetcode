class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        // int max = 0, l = 0;
        // HashMap<Integer,Integer> map = new HashMap<>();
        // for(int i =0; i < nums.length; i++) {
        //     map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        //     if(map.get(nums[i]) <= k) l++;
        //     else l = 1;
        //     max = Math.max(max,l);
        // }
        // return max;

        // int max = 0, l = 0;
        // HashMap<Integer,Integer> map = new HashMap<>();
        
        // int m = 0;
        // for(int i : nums) m = m<i? i:m;
        // int c[] = new int[m];

        // for(int r = 0; r < nums.length; r++) {
        //     c[nums[r]-1]++;
        //     if(map.get(nums[r]) != null) {
        //         if(c[nums[r]-1] > k) {
        //             l = map.get(nums[r])+1;
        //             map.put(nums[r],r);
        //         }
        //     } else {
        //         map.put(nums[r],r);
        //     }
        //     max = Math.max(max,(r-l));
        // }
        // return max;
        int max = 0, l = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int r = 0; r < nums.length; r++) {
            map.put(nums[r],map.getOrDefault(nums[r], 0) + 1);
            while(map.get(nums[r])>k) {
                map.put(nums[l], map.get(nums[l])-1);
                l++;
            }
            max = Math.max(max, r-l+1);
        }
        return max;
    }
}