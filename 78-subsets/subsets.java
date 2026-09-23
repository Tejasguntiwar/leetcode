class Solution {
    public void rec(int nums[], List<List<Integer>> list, List<Integer> lis, int i) {
        if(i == nums.length) {
            list.add(new ArrayList<>(lis));
            // lis.clear();
            // System.out.println("Last = " + lis);
            return;
        }
        // List<Integer> lis = new ArrayList<>();
        lis.add(nums[i]);

        rec(nums, list, lis, i+1);

        lis.remove(lis.size()-1);

        // System.out.println(nums[i]);
        // System.out.println(lis);
        
        rec(nums, list, lis, i+1);
    }
    
    public List<List<Integer>> findSub(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> lis = new ArrayList<>();
        
        rec(nums, list, lis, 0);

        return list;
    }
    public List<List<Integer>> subsets(int[] nums) {

        return findSub(nums);
    }
}