import java.util.HashSet;
import java.util.Set;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        // Step 1: Add all elements of nums1 to a HashSet to remove duplicates
        Set<Integer> set1 = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            set1.add(nums1[i]);
        }

        // Step 2: Create a temporary list or set to store the intersection result
        Set<Integer> resultSet = new HashSet<>();
        for (int j = 0; j < nums2.length; j++) {
            if (set1.contains(nums2[j])) {
                resultSet.add(nums2[j]); // Ensures no duplicate answers
            }
        }

        // Step 3: Convert the result set into an int[] array
        int[] result = new int[resultSet.size()];
        int k = 0;
        for (int n : resultSet) {
            result[k++] = n;
        }

        return result;
    }
}