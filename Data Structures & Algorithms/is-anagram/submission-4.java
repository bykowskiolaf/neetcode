class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }

        int[] sFreq = new int[27];
        int[] tFreq = new int[27];
        
        for(int i = 0; i < s.length(); i++) {
            Character sCurrAt = s.charAt(i);
            Character tCurrAt = t.charAt(i);

            int sCurrIdx = sCurrAt - 'a' + 1;
            int tCurrIdx = tCurrAt - 'a' + 1;

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
