class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> values = new HashSet<>();

        for(int i = 0; i < nums.length; i++) {
            boolean contains = values.contains(nums[i]);

            if(contains) {
                return true;
            } else {
                values.add(nums[i]);
            }
        }

        return false;
    }
}