class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // O(nlogn)
        Arrays.sort(nums);
        List<List<Integer>> retVal = new ArrayList<>();

        for(int i = 0; i < nums.length; i++) { 
            if(i >= 1 && nums[i] == nums[i-1]) continue;

            int currentNum = nums[i];
            int leftIdx = i + 1;
            int rightIdx = nums.length - 1;

            while(leftIdx < rightIdx) {
                int leftNum = nums[leftIdx];
                int rightNum = nums[rightIdx];

                int sum = currentNum + leftNum + rightNum; 

                if (sum == 0) {
                    retVal.add(List.of(currentNum, leftNum, rightNum));
                    
                    while(leftIdx < rightIdx && nums[leftIdx] == leftNum) {
                        leftIdx++;
                    }

                    while(leftIdx < rightIdx && nums[rightIdx] == rightNum) {
                        rightIdx--;
                    }
                }

                if (sum < 0) {
                    leftIdx++;
                }

                if (sum > 0) {
                    rightIdx--;
                }
            } 
            
        }


        return retVal;
    }
}
