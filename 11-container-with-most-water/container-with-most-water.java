class Solution {
    public int maxArea(int[] height) {
        int maxArea = Integer.MIN_VALUE;
        int left = 0;
        int right = height.length-1;
        for(int i=0;i<height.length-1;i++){
            int h = Math.min(height[left],height[right]);
            int w = right - left;
            maxArea = Math.max(maxArea,h*w);
            if(height[left] < height[right]){
                left++;
            }else{
                right--;
            }
        }
        return maxArea;
    }
}