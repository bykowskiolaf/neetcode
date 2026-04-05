class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        Map<Character, Character> parenthesesMap = Map.of(
            ')', '(', 
            ']', '[', 
            '}', '{'
        );

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            System.out.println(c);
            System.out.println(stack.toString());

            // char is a open parentheses
            if(parenthesesMap.values().contains(c)) {
                stack.push(c);
            // char is a closed parentheses
            } else {
                if(stack.isEmpty()) return false;

                if(stack.pop() == parenthesesMap.get(c)) {
                    continue;
                } else {
                    return false;
                }
            }
        }

        if(!stack.isEmpty()) return false;

        return true;
    }
}
