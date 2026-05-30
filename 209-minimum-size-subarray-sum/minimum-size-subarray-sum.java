class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int count=0;
        int res = Integer.MAX_VALUE;
        int j=0;
        int currSum =0;

        for(int i=0;i<nums.length;i++){
            currSum += nums[i];
            count++;
            while(currSum >= target){
                res = Math.min(res,count);
                currSum -= nums[j];
                j++;
                count--;
            }
        }
        return res==Integer.MAX_VALUE?0:res;
    }
}