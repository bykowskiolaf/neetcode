class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> charactersInCurrentWindow = new HashSet<>();
        int left = 0;
        int right = 0;
        int longest = 0;

        while(left < s.length() && right < s.length()) {
            if(!charactersInCurrentWindow.contains(s.charAt(right))) {
                charactersInCurrentWindow.add(s.charAt(right));
                right++;
                longest = Math.max(longest, charactersInCurrentWindow.size());
            } else {
                charactersInCurrentWindow.remove(s.charAt(left));
                left++;
            }
        }

        return longest;
    }
}
