class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }

        int[] sFreq = new int[26];
        int[] tFreq = new int[26];
        
        for(int i = 0; i < s.length(); i++) {
            Character sCurrAt = s.charAt(i);
            Character tCurrAt = t.charAt(i);

            int sCurrIdx = sCurrAt - 'a';
            int tCurrIdx = tCurrAt - 'a';

            sFreq[sCurrIdx] = sFreq[sCurrIdx] + 1;
            tFreq[tCurrIdx] = tFreq[tCurrIdx] + 1;
        }

        for(int i = 0; i < sFreq.length; i++) {
            if(sFreq[i] != tFreq[i]) {
                return false;
            }
        }

        return true;
    }
}
