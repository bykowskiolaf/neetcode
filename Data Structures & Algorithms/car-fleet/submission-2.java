class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        Deque<Double> stack = new ArrayDeque<>();
        int[][] cars = new int[position.length][2];

        for(int i = 0; i < position.length; i++) {
            cars[i][0] = position[i];
            cars[i][1] = speed[i];
        }

        Arrays.sort(cars, (a,b) -> Double.compare(b[0], a[0]));

        stack.push(Double.valueOf((target - cars[0][0])) / cars[0][1]);

        for(int i = 1; i < cars.length; i++) {
            int carsPosition = cars[i][0];
            int carsSpeed = cars[i][1];

            double timeToArrival = Double.valueOf((target - carsPosition)) / carsSpeed;
        
            if(stack.peek() < timeToArrival) {
                stack.push(timeToArrival);
            }
        }

        return stack.size();
    }
}
