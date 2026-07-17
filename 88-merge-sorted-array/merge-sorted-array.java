class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        // i points to the last valid element of nums1
        int i = m - 1;

        // j points to the last element of nums2
        int j = n - 1;

        // k points to the last position of nums1
        int k = m + n - 1;

        // Compare elements from the end and place the larger one
        while (i >= 0 && j >= 0) {

            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }

            k--;
        }

        // Copy remaining elements from nums2 (if any)
        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }
}