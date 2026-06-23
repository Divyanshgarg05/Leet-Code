class Solution {
    public int maxArea(int[] height) {
        int maxArea = Integer.MIN_VALUE;
        int left = 0;
        int right = height.length-1;
        for(int i = 0;i<height.length;i++){
            int minHeight = Math.min(height[left],height[right]);
            int width = right - left ;
            int area = minHeight * width;
            maxArea = Math.max(maxArea , area);
            if(height[left] < height[right]){
                left++;
            }else{
                right --;
            }

        }
        return maxArea;
    }
}