class Solution {
    public int largestRectangleArea(int[] heights) {
        int maxa = Integer.MIN_VALUE;
        int n = heights.length;
        int nsl[] = new int[n];
        int nsr[] = new int[n];
        Stack<Integer> s = new Stack<>();

        for(int i = n-1; i >=0; i--) {
            while(!s.isEmpty() && heights[s.peek()] >= heights[i]) {
                s.pop();
            }
            if(s.isEmpty()) nsr[i] = n;
            else nsr[i] = s.peek();
            s.push(i);
        }
        s = new Stack<>();
        for(int i = 0; i < n; i++) {
            while(!s.isEmpty() && heights[s.peek()] >= heights[i]) {
                s.pop();
            }
            if(s.isEmpty()) nsl[i] = -1;
            else nsl[i] = s.peek();
            s.push(i);
        }
        for(int i = 0; i < n; i++) {
            int w = nsr[i] - nsl[i] - 1;
            int a = heights[i] * w;
            maxa = Math.max(a,maxa);
        }
        return maxa;
    }
    // public int largestRectangleArea(int[] heights) {
    //     // int gmax = Integer.MIN_VALUE;

    //     // for(int i = 0; i < heights.length; i++) {
    //     //     int a = 0;
    //     //     int j = i-1;
    //     //     while(j>=0 && heights[j] >= heights[i]) {
    //     //         // a = heights[i] * (i - j) + 1;
    //     //         j--;
    //     //     }
    //     //     int m = i + 1;
    //     //     while(m< heights.length && heights[m] >= heights[i]) {
    //     //         m++;
    //     //     }
    //     //     System.out.println(j);
    //     //     System.out.println(m);
    //     //     a = heights[i] * (m - j - 1);
    //     //     gmax = Math.max(a, gmax);
    //     // }
    //     // return gmax;
    // }
}