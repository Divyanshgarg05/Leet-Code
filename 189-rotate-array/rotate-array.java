class Solution {
    public void rotate(int[] nums, int k) {
    //      k = k % nums.length;
    //     rev(nums,0,nums.length-1);
    //     rev(nums,0,k-1);
    //     rev(nums,k,nums.length-1);
    // }
    // private void rev(int []nums , int l , int r){
    //     while(l<r){
    //         int temp = nums[l];
    //         nums[l] = nums[r];
    //         nums[r] = temp;
    //         l++;
    //         r--;
    //     }
    int n = nums.length;
    k %= nums.length;
    int dummy[] = new int[k];
    for(int i=0;i<k;i++){
        dummy[i] = nums[n-k+i];
    }
    for(int i=n-k-1;i>=0;i--){
        nums[i+k] = nums[i];
    }
    for(int i=0;i<k;i++){
        nums[i] = dummy[i];
    }
    }
}