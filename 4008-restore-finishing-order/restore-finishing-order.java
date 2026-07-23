class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        // String str = Arrays.toString(friends);
        int[] arr = new int[friends.length];

        // for(int i = 0; i < order.length; i++){
        //     if(str.indexOf(order[i]) != -1) arr[i] = order[i]; 
        // }
        int k = 0;
        for(int i = 0; i < order.length; i++){
            for(int j = 0; j < friends.length; j++){
                if(order[i] == friends[j]) arr[k++] = friends[j]; 
            }
        }
        return arr;
    }
}