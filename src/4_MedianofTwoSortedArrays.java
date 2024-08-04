class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int[] arr = new int[n1 + n2];
        int i =0,j = 0, k=0;
        while(i<n1 && j<n2) {
            if(nums1[i] < nums2[j]) {
                arr[k++] = nums1[i++];
            } else {
                arr[k++] = nums2[j++];
            }
        }
        while(i<n1) {
            arr[k++] = nums1[i++];
        }
        while(j<n2) {
            arr[k++] = nums2[j++];
        }
        double result;
        if(arr.length % 2 != 0) {
            result = (double) arr[k / 2];
        } else {
            result = ((double) arr[k / 2 -1] + (double) arr[k/2]) / 2;
        }
        return result;
    }
}