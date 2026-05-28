class Solution {
    public int maxArea(int[] height) {
        int left =0;
        int right = height.length-1;
        int maxArea = 0;
        while(left<right){
            int currHeight = Math.min(height[left],height[right]);
            int width = right - left;
            int area = currHeight * width;
            maxArea = Math.max(maxArea,area);
            if(height[left] > height[right])right--;
            else left++;
        }

        return maxArea;
    }
}