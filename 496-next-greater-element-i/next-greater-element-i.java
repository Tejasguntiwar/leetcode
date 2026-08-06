// class Solution {
//     public int[] nextGreaterElement(int[] nums1, int[] nums2) {
//         Stack<Integer> s = new Stack<>();
//         int[] ngr = new int[nums2.length];
//         for(int i = nums2.length-1; i >= 0; i--) {
//             while(!s.isEmpty() && nums2[s.peek()] <= nums2[i]) {
//                 s.pop();
//             }
//             if(s.isEmpty()){
//                 ngr[i] = -1;
//             }
//             else ngr[i] = nums2[s.peek()];
//             s.push(i);
//         }
//         HashMap<Integer, Integer> map = new HashMap<>();
//         for(int i = 0; i < nums1.length; i++) {
//             map.put(nums1[i],i);
//         }
//         for(int j = 0; j < nums2.length; j++) {
//             if(map.containsKey(nums2[j])) {
//                 System.out.println(map.get(nums2[j]));
//                 nums1[map.get(nums2[j])] = ngr[j];
//                 break;
//             }
//         }
//         return nums1;
//     }
// }
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> s = new Stack<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int n: nums2) {
            while(!s.isEmpty() && s.peek() < n) {
                map.put(s.pop(), n);
            }
            s.push(n);
        }
        int res[] = new int[nums1.length];
        for(int i = 0; i<res.length; i++) {
            res[i] = map.getOrDefault(nums1[i],-1);
        }
        return res;
    }
}