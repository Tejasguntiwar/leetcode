class Solution {
    HashMap<Integer, ArrayList<Integer>> map;
    public Solution(int[] nums) {
        map = new HashMap<>();
        for(int i = 0; i<nums.length; i++) {
            if(map.get(nums[i])!=null) {
                map.get(nums[i]).add(i);
            }else {
                ArrayList<Integer> l = new ArrayList<>();
                l.add(i);
                map.put(nums[i], l);
            }
        }
    }
    
    public int pick(int target) {
        Random r = new Random();
        int idx = r.nextInt(0,map.get(target).size());
        return map.get(target).get(idx);
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int param_1 = obj.pick(target);
 */