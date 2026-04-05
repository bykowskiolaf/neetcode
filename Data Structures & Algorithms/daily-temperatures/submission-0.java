class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        Deque<Integer> stack = new ArrayDeque<>();

        stack.push(0);

        for(int i = 1; i < temperatures.length; i++) {
            while(!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int pendingIdx = stack.pop();

                result[pendingIdx] = i - pendingIdx;
            }

            stack.push(i);
        }

        return result;
    }
}
