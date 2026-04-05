class Solution {
    public int maxArea(int[] heights) {
        int leftIdx = 0;
        int rightIdx = heights.length - 1;
        int maxArea = 0;

        while(leftIdx < rightIdx) {
            int diffInIdx = rightIdx - leftIdx; // X axis length
            int height = Math.min(heights[leftIdx], heights[rightIdx]); // Y axis length
            int area = diffInIdx * height;

            maxArea = Math.max(maxArea, area);
            
            if (heights[leftIdx] < heights[rightIdx]) {
                leftIdx++;
            } else {
                rightIdx--;
            }
        }


        return maxArea;
    }
}
