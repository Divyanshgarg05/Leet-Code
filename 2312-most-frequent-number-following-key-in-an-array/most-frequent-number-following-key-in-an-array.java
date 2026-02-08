import java.util.*;

class Solution {
    public int mostFrequent(int[] nums, int key) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == key) {
                int target = nums[i + 1];
                map.put(target, map.getOrDefault(target, 0) + 1);
            }
        }

        int ans = -1, max = 0;
        for (int num : map.keySet()) {
            if (map.get(num) > max) {
                max = map.get(num);
                ans = num;
            }
        }

        return ans;
    }
}
