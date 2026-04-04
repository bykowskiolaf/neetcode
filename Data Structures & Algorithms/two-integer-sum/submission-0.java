class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            Integer lookingFor = target - nums[i];
            Integer foundIndex = map.get(lookingFor);

            if(!Objects.isNull(foundIndex)){
                return new int[] { foundIndex, i };
            } else {
                map.put(nums[i], i);
            }
        }
        
        // should never reach since an answer always exists
        return new int[] {};
    }
}
