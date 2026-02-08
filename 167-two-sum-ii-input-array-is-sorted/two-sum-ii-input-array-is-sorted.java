class Solution {
    public int[] twoSum(int[] numbers, int target) {
       
        int i=0,j=numbers.length-1;
        while(i<=j){
            if(numbers[i] + numbers[j] == target){
               int[] ans = {i+1,j+1};
                return ans;
            }
            else if(numbers[i] + numbers[j] <target){
                i++;
            }
            else{
                j--;
            }
        }
         int[] ans = {-1,-1};
         return ans;
    }
}