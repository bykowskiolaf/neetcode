class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int firstIndex = 0;
        int secondIndex = numbers.length - 1;

        int firstNumber = numbers[firstIndex]; 
        int secondNumber = numbers[secondIndex]; 

        int sum = firstNumber + secondNumber; 

        while((sum != target) && (firstIndex < secondIndex)) {
            if(sum < target) {
                firstIndex++;
                firstNumber = numbers[firstIndex];
            } else {
                secondIndex--;
                secondNumber = numbers[secondIndex];
            }

            sum = firstNumber + secondNumber;
        }

        return new int[] {++firstIndex, ++secondIndex};
    }
}
