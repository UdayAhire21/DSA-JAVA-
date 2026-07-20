class Solution {
    public int removeDuplicates(int[] nums) {

        // If the array is empty, there are no unique elements
        if (nums.length == 0) {
            return 0;
        }

        // j points to the last unique element
        int j = 0;

        // Start checking from the second element
        for (int i = 1; i < nums.length; i++) {

            // Found a new unique element
            if (nums[i] != nums[j]) {

                j++;                  // Move to next position
                nums[j] = nums[i];    // Store the unique element
            }
        }

        // Number of unique elements
        return j + 1;
    }
}