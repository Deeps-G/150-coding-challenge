class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] count = new int[26];
        // Step 1: Count letters in magazine
        for (char c : magazine.toCharArray()) {
            count[c - 'a']++;
        }
        // Step 2: Check ransomNote
        for (char c : ransomNote.toCharArray()) {
            if (count[c - 'a'] == 0) {
                return false;
            }
            count[c - 'a']--;
        }
        return true;
    }
}
