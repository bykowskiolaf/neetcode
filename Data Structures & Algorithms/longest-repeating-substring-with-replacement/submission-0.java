class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character, Integer> freq = new HashMap<>();
        int left = 0;
        int right = 0;
        int longest = 0;
        int maxFreq = 0;

        while(left < s.length() && right < s.length()) {
            freq.put(s.charAt(right), freq.getOrDefault(s.charAt(right), 0) + 1);
            maxFreq = Math.max(maxFreq, freq.get(s.charAt(right)));
            right++;

            int windowSize = right - left;
            
            if ((windowSize - maxFreq) > k) {
                freq.put(s.charAt(left), freq.get(s.charAt(left)) - 1);
                left++;
            }

            longest = Math.max(longest, right - left);
        }
        
        return longest;
    }
}
