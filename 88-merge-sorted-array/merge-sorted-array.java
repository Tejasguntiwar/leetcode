class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // int[] newArr = new int[n+m];
        // for(int i = 0; i <m; i++) {
        //     newArr[i] = nums1[i];
        // }
        // for(int i = m; i <m+n; i++) {
        //     newArr[i] = nums2[i-m];
        // }
        // Arrays.sort(newArr);
        
        // for(int i = 0; i <m+n; i++) {
        //     nums1[i] = newArr[i];
        // }

        
        // if(nums2.length==0) return;
        // if(nums1.length==0) return;
        // System.out.println(nums1.length);
        // for(int i = m; i <m+n; i++) {
        //     nums1[i] = nums2[i-m];
        // }
        // Arrays.sort(nums1);
        
        int i = m-1, j = n-1, k = m+n-1;
        while(i>=0 && j>=0) {
            if(nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }
        while(j >= 0) {
            nums1[k--] = nums2[j--];
        }
    }
}
// class Solution {
//     public void merge(int[] nums1, int m, int[] nums2, int n) {
//         // if(m == 0) {
//         //     for(int i = 0; i < nums1.length; i++) {
//         //         nums1[i] = nums2[i];
//         //     }
//         //     return;
//         // }
//         int n1 = m-1, n2 = n-1, i = m + n - 1;
//         while(n1 >= 0 && n2 >= 0) {
//             if(nums1[n1] > nums2[n2]) {
//                 nums1[i--] = nums1[n1--];
//             }else {
//                 nums1[i--] = nums2[n2--];
//             }
//         }
//         while(n2>=0)
//         nums1[i--] = nums2[n2--];
//     }
// }