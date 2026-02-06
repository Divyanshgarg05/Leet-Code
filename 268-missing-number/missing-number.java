class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;
        int totalSum =0;
        int count=1;
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
            totalSum += count;
            count++;
        }
        return totalSum - sum;
    }
}