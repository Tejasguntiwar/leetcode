class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length, m = nums2.length;
        int[] combined = new int[n+m];
        int i = 0, j = 0, k = 0;
        while(i<n && j < m) {
            if(nums1[i] < nums2[j]) 
            combined[k++] = nums1[i++];
            else
            combined[k++] = nums2[j++]; 
        }
        while(i<n) {
            combined[k++] = nums1[i++];
        }
        while(j<m) {
            combined[k++] = nums2[j++];
        }
        if((n+m) % 2 == 0) {
            int p = combined[((n+m)/2)-1] + combined[((n+m)/2)];
            System.out.println(combined[((n+m)/2)-1] + " " + combined[((n+m)/2)]);
            return (double)p/2;
        }else return combined[(n+m)/2];
    }
}