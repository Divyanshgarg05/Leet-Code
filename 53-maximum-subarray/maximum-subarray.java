class Solution {
    public int maxSubArray(int[] nums) {
        int cs = 0;
        int ms = Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++){
            cs = Math.max(nums[i] , cs + nums[i]);
            ms = Math.max(ms , cs);
        }
        return ms;
    }
}