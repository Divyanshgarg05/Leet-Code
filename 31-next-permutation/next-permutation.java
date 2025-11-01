class Solution {
    public static void reverse(int[] arr, int start, int end) {
            while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
    public void nextPermutation(int[] nums) {
        int idx = -1;
        int n = nums.length-1;
        for(int i=n-1;i>=0;i--){
            if(nums[i]<nums[i+1]){
                idx = i;
                break;
            }
        }
        if(idx==-1){
            reverse(nums,0,n);
            return;
        }
        for(int i=n;i>idx;i--){
            if(nums[i]>nums[idx]){
                int t = nums[i];
                nums[i]= nums[idx];
                nums[idx] = t;
                break;
            }
        }
        reverse(nums,idx+1,n);
        return;
        // System.out.print("[");
        // for(int i=0;i<n;i++){
        //     System.out.print(nums[i]+",");
        // }
        // System.out.print("[");
    }
}