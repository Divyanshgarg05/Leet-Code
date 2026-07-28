class Solution {
    public void reverse(int[] nums , int start , int end){
        while(start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            end--;
            start++;
        }
    }
    public void nextPermutation(int[] nums) {
        int idx = -1;
        int n = nums.length-1;
        for(int i=n-1;i>=0;i--){
            if(nums[i+1] > nums[i]){
                idx = i;
                break;
            }
        }

        if(idx == -1){
            reverse(nums,0,n);
            return;
        }

        for(int i=n;i>idx;i--){
            if(nums[i] > nums[idx]){
                int temp = nums[i];
                nums[i] = nums[idx];
                nums[idx] = temp;
                break;
            }
        }

        reverse(nums,idx+1,n);
        return;
    }
}