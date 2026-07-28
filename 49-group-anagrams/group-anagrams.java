// class Solution {
//     public boolean isAnagram(String s1, String s2) {
//         if(s1.length() != s2.length()) return false;
//         if(s1.length()==0) return true;
//         char[] s11 = s1.toCharArray();
//         char[] s22 = s2.toCharArray();
//         Arrays.sort(s11);
//         Arrays.sort(s22);
//         for(int i = 0; i < s11.length; i++){
//             if(s11[i] != s22[i]) return false;
//         }
//         return true;
//     }
//     public List<List<String>> groupAnagrams(String[] strs) {
//         HashMap<String, Integer> map = new HashMap<>();

//         for(String str: strs){
//             map.put(str, 0);
//         }

//         List<List<String>> list = new ArrayList<>();

//         for(int i = 0; i < strs.length; i++) {
//             List<String> lis = new ArrayList<>();
//             if(map.get(strs[i]) == 0) {
//                 lis.add(strs[i]);
//                 map.put(strs[i],1);
//             }
//             for(int j = i+1; j < strs.length; j++) {
//                 // System.out.println((strs[i] + " " + strs[j]) + " " + isAnagram(strs[i], strs[j]));
//                 if(map.get(strs[j]) == 0 && isAnagram(strs[i], strs[j])) {
//                     map.put(strs[j],1);
//                     lis.add(strs[j]);
//                 }
//             }
//             if(lis.size()>0)
//             list.add(lis);
//         }
//         return list;
//     }
// }
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for(String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = String.valueOf(chars);
            if(!map.containsKey(key)) {
                map.put(key,new ArrayList<>());
            }
            map.get(key).add(str);
        }
        
        return new ArrayList<>(map.values());
    }
}