class Solution {
    public List<Integer> majorityElement(int[] nums) {

        int n = nums.length;

        // Stores each element and its frequency
        Map<Integer, Integer> map = new HashMap<>();

        // Stores the elements appearing more than n/3 times
        List<Integer> result = new ArrayList<>();

        // Step 1: Count frequency of every element
        for (int i = 0; i < n; i++) {
           map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        // Step 2: Find elements appearing more than n/3 times
        for (int i = 0; i < n; i++) {

            // Check whether the element exists in the map
            // and whether its frequency is greater than n/3
            if (map.containsKey(nums[i]) &&
                map.get(nums[i]) > n / 3) {

                // Add the majority element to the result
                result.add(nums[i]);

                // Remove it to prevent duplicate additions
                map.remove(nums[i]);
            }
        }

        return result;
    }
}