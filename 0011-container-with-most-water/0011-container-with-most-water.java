class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

       for(int i = 0; i<height.length; i++){
            int c = Math.min(height[left], height[right]) * (right - left);
            maxArea = Math.max(maxArea,c);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }
}