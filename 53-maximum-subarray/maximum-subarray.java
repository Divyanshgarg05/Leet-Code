class Solution {
    public int maxSubArray(int[] nums) {
        int cs = 0;
        int ms = Integer.MIN_VALUE;
        for(int i : nums){
            cs = Math.max(i,cs+i);
            ms = Math.max(ms,cs);
        }
        return ms;
    }
}