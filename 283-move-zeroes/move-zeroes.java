class Solution {
    public void moveZeroes(int[] nums) {
        int count =0;
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(!(nums[i] == 0)){
                nums[j] = nums[i];
                j++;
            }else{
                count++;
            }
        }
        for(int i=0;i<count;i++){
            nums[j] = 0;
            j++;
        }
    }
}