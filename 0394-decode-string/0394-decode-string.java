class Solution {
    int i = 0;
    public String decodeString(String s) {
        StringBuilder result = new StringBuilder();
        while (i < s.length() && s.charAt(i) != ']') {
            if (Character.isDigit(s.charAt(i))) {
                int num = 0;
                while (Character.isDigit(s.charAt(i))) {
                    num = num * 10 + (s.charAt(i) - '0');
                    i++;
                }
                i++; // skip '['
                String decoded = decodeString(s);
                i++; // skip ']'
                while (num-- > 0) {
                    result.append(decoded);
                }
            } 
            else {
                result.append(s.charAt(i++));
            }
        }
        return result.toString();
    }
}