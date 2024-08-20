class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if(c=='(' || c=='[' || c == '{') {
                stack.push(c);
            } else {
                if(stack.empty()) return false;
                char open = stack.pop();
                if(open=='(' && c==')' || 
                open=='[' && c==']' || 
                open=='{' && c=='}' ) {
                    continue;
                } else {
                    return false;
                }
            }
        }
        return stack.empty();
    }
}
