import java.util.*;

class Solution {

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        findSubsets(nums, 0, new ArrayList<>(), result);
        return result;
    }

    public void findSubsets(int[] nums, int i, List<Integer> ans, List<List<Integer>> result) {

        // base case
        if (i == nums.length) {
            result.add(new ArrayList<>(ans)); // store subset
            return;
        }

        // YES choice (include element)
        ans.add(nums[i]);
        findSubsets(nums, i + 1, ans, result);

        // backtrack
        ans.remove(ans.size() - 1);

        // NO choice (exclude element)
        findSubsets(nums, i + 1, ans, result);
    }
}

    