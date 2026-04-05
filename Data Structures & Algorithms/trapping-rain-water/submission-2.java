class Solution {
    public int trap(int[] height) {
        int waterSum = 0;

        int left = 0;
        int right = height.length - 1;

        int maxSoFarLeft = 0;
        int maxSoFarRight = 0;

        while (left < right) {
            maxSoFarLeft = Math.max(maxSoFarLeft, height[left]);
            maxSoFarRight = Math.max(maxSoFarRight, height[right]);

            if(maxSoFarLeft < maxSoFarRight) {
                waterSum += maxSoFarLeft - height[left];
                left++;
            } else {
                waterSum += maxSoFarRight - height[right];
                right--;
            }
        }

        return waterSum;
    }
}
