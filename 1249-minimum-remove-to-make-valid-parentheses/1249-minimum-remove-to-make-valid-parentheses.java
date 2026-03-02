class Solution {
    public String minRemoveToMakeValid(String s) {
        StringBuilder sb = new StringBuilder();
        int open = 0;
        // First pass: remove extra ')'
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                open++;
                sb.append(ch);
            } 
            else if (ch == ')') {
                if (open > 0) {
                    open--;
                    sb.append(ch);
                }
            } 
            else {
                sb.append(ch);
            }
        }
        // Second pass: remove extra '('
        StringBuilder result = new StringBuilder();
        int extraOpen = open;
        for (int i = sb.length() - 1; i >= 0; i--) {
            char ch = sb.charAt(i);
            if (ch == '(' && extraOpen > 0) {
                extraOpen--;
            } else {
                result.append(ch);
            }
        }
        return result.reverse().toString();
    }
}