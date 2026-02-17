class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int res = Integer.MAX_VALUE;
        int currSum = 0;
        int count = 0;
        int j = 0;

        for (int i = 0; i < n; i++) {
            currSum += nums[i];
            count++;

         
            while (currSum >= target) {

               
                res = Math.min(res, count);

               
                currSum -= nums[j];
                j++;
                count--;
            }
        }

      
        return res == Integer.MAX_VALUE ? 0 : res;
    }
}
