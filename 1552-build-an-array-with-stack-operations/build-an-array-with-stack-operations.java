class Solution {
    public List<String> buildArray(int[] target, int n) {
        if(target.length == 0) return new ArrayList<String>();
        int len = target.length;
        List<String> list = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        int j = 0;
        for(int i = 1; i<= target[len-1]; i++) {
            st.push(i);
            if(target[j] != st.peek()) {
                st.pop();
                list.add("Push");
                list.add("Pop");
            } else {
                list.add("Push");
                j++;
            }
        }
        return list;
    }
}