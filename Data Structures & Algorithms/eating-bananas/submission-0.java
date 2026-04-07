class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int maxPile = Arrays.stream(piles).max().getAsInt();

        int left = 1;
        int right = maxPile;

        int minimum = maxPile;

        while(left <= right) {
            int middle = left + (right - left) / 2;
            
            int timeToEatPiles = hoursToEatPiles(piles, middle);

            if (timeToEatPiles <= h) {
                minimum = Math.min(minimum, middle);
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }

        return minimum;
    }

    private int hoursToEatPiles(int[] piles, int k) {
        int totalTime = 0;
        for(int i = 0; i < piles.length; i++) {
            totalTime += (piles[i] + k - 1) / k;
        }

        return totalTime;
    }
}
