class Solution {
    public int trap(int[] height) {
        int waterSum = 0;
        int[] waterHeight = new int[height.length];
        int[] prefix = new int[height.length];
        int[] suffix = new int[height.length];

        prefix[0] = 0;
        suffix[height.length -1] = 0;

        int highestSoFar = 0;
        for(int i = 0; i < height.length; i++) {            
            highestSoFar = Math.max(highestSoFar, height[i]);

            prefix[i] = highestSoFar;
        }

        highestSoFar = 0;

        for(int i = height.length - 1; i > 0; i--) {
            highestSoFar = Math.max(highestSoFar, height[i]);

            suffix[i] = highestSoFar;
        }

        System.out.println(Arrays.toString(suffix));
        System.out.println(Arrays.toString(prefix));

        for(int i = 0; i < height.length; i++) {
            int waterThatFits = Math.min(prefix[i], suffix[i]) - height[i]; 
            if (waterThatFits > 0) {
                waterHeight[i] = waterThatFits;
            }
        }

        for(int i = 0; i < waterHeight.length; i++) {
            waterSum += waterHeight[i];
        }
        
        return waterSum;
    }
}
