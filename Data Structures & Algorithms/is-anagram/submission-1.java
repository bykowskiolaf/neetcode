class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] freqS = new int[26];
        int[] freqT = new int[26];

        char[] charsS = s.toCharArray();
        char[] charsT = t.toCharArray();

        for(int i = 0; i < t.length(); i++) {
            int sIndex = charsS[i] - 'a';
            int tIndex = charsT[i] - 'a';
            freqS[sIndex] += 1;
            freqT[tIndex] += 1;
        }

        for(int i = 0; i < 26; i++) {
            if(freqS[i] != freqT[i]) {
                return false;
            }
        }

        return true;
    }
}
