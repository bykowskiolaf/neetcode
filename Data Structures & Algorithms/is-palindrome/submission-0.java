class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        for(int i = 0; i < s.length()/2; i++) {
            char first = s.charAt(i);
            char last = s.charAt(s.length() - 1 - i);

            System.out.println(first);
            System.out.println(last);

            if (first != last) {
                return false;
            }
        }

        return true;
    } 
}
