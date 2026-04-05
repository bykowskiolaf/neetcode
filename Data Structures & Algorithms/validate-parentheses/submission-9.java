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

            // char is a closed parentheses
            if(parenthesesMap.containsKey(c)) {
                if(stack.isEmpty()) return false;

                if(stack.pop() == parenthesesMap.get(c)) {
                    continue;
                } else {
                    return false;
                }

            // char is a open parentheses
            } else {                
                stack.push(c);
            }
        }

        return stack.isEmpty();
    }
}
