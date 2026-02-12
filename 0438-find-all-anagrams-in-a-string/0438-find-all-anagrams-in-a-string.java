import java.util.*;

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        
        List<Integer> result = new ArrayList<>();
        
        if(s.length() < p.length()) return result;
        
        int[] pCount = new int[26];
        int[] sCount = new int[26];
        
        // Step 1: frequency of p
        for(char c : p.toCharArray()) {
            pCount[c - 'a']++;
        }
        
        int windowSize = p.length();
        
        for(int i = 0; i < s.length(); i++) {
            
            // add current character
            sCount[s.charAt(i) - 'a']++;
            
            // remove character outside window
            if(i >= windowSize) {
                sCount[s.charAt(i - windowSize) - 'a']--;
            }
            
            // compare arrays
            if(Arrays.equals(pCount, sCount)) {
                result.add(i - windowSize + 1);
            }
        }
        
        return result;
    }
}
