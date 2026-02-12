class Solution {
    public int firstUniqChar(String s) {
    HashMap<Character, Integer> map = new HashMap<>();
    
    // Step 1: Count frequency
    for (int i = 0; i < s.length(); i++) {
        char ch = s.charAt(i);
        map.put(ch, map.getOrDefault(ch, 0) + 1);
    }
    
    // Step 2: Find first unique
    for (int i = 0; i < s.length(); i++) {
        if (map.get(s.charAt(i)) == 1) {
            return i;
        }
    }
    
    return -1;
}
}