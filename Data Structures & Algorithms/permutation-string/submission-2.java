class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1 == null && s2 == null) return true;
        if(s1.length() > s2.length()) return false;

        Map<Character, Integer> stringFreqMap = new HashMap<>();
        Map<Character, Integer> windowFreqMap = new HashMap<>();
        
        int left = 0;
        int right = s1.length() - 1;

        for (int i = 0; i < s1.length(); i++) {
            stringFreqMap.put(s1.charAt(i), stringFreqMap.getOrDefault(s1.charAt(i), 0) + 1);
            windowFreqMap.put(s2.charAt(i), windowFreqMap.getOrDefault(s2.charAt(i), 0) + 1);
        }

        if(stringFreqMap.equals(windowFreqMap)) {
            return true;
        }

        while(right < s2.length() - 1) {
            if (windowFreqMap.get(s2.charAt(left)) - 1 == 0) {
                windowFreqMap.remove(s2.charAt(left));
            } else {
                windowFreqMap.put(s2.charAt(left), windowFreqMap.get(s2.charAt(left)) - 1);
            }

            left++;
            right++;

            windowFreqMap.put(s2.charAt(right), windowFreqMap.getOrDefault(s2.charAt(right), 0) + 1);

            if(stringFreqMap.equals(windowFreqMap)) {
                return true;
            }
        }

        return false;
    }

}
