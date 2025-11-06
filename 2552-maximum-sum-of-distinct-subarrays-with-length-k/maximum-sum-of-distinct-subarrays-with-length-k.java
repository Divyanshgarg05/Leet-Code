import java.util.*;

class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int n = nums.length;
        long result = 0;
        long currSum = 0;
        Set<Integer> set = new HashSet<>();
        int i = 0, j = 0;

        while (j < n) {
            // Remove elements until nums[j] becomes unique in the window
            while (set.contains(nums[j])) {
                currSum -= nums[i];
                set.remove(nums[i]);
                i++;
            }

            currSum += nums[j];
            set.add(nums[j]);

            // When window size == k, check max sum
            if (j - i + 1 == k) {
                result = Math.max(result, currSum);
                // Slide the window
                currSum -= nums[i];
                set.remove(nums[i]);
                i++;
            }
            j++;
        }

        return result;
    }
}
