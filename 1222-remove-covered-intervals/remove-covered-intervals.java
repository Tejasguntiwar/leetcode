class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a,b)-> {
            if(a[0] != b[0]) {
                return Integer.compare(a[0],b[0]);
            } else {
                return Integer.compare(b[1],a[1]);
            }
        });

        int c = 0,max = 0;
        for(int i = 0; i < intervals.length; i++) {
            if(intervals[i][1]>max) {
                c++;
                max = intervals[i][1];
            }
            continue;
            // System.out.println(intervals[i][0] + " " + intervals[i][1]);
        }
        return c;
    }
}