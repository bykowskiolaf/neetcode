class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            int num = nums[i];
            // num = 3
            // target = 7
            // neededNum = 4
            int neededNum = target - num; 

            Integer neededNumIdx = map.get(neededNum);

            if(neededNumIdx == null) {
                map.put(num, i);
            } else {
                return new int[]{neededNumIdx, i};
            }
        }

        return new int[]{};
    }
}
