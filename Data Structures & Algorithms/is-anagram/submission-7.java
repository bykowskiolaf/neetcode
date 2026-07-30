class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }

        int[] freq = new int[26];
        
        for(int i = 0; i < s.length(); i++) {
            char sCurrAt = s.charAt(i);
            char tCurrAt = t.charAt(i);

            int sCurrIdx = sCurrAt - 'a';
            int tCurrIdx = tCurrAt - 'a';

            freq[sCurrIdx] = freq[sCurrIdx] + 1;
            freq[tCurrIdx] = freq[tCurrIdx] - 1;
        }

        for(int i = 0; i < freq.length; i++) {
            if(freq[i] != 0) {
                return false;
            }
        }

        return true;
    }
}
