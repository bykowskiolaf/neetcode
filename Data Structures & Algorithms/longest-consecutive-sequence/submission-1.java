class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> knownNumbers = new HashSet<>();
        int longest = 0;

        for(int num: nums) {
            knownNumbers.add(num);
        }

        for(int i = 0; i < nums.length; i++) {
            int n = nums[i];
            if(!knownNumbers.contains(n-1)) {
                int currentNumber = n;
                int length = 1;
                
                while(knownNumbers.contains(currentNumber + 1)) {
                    currentNumber++;
                    length++;
                }

                if (length > longest) longest = length;
            }
        }

        return longest;
    }
}
