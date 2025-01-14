class Solution {
    public int lengthOfLastWord(String s) {
        
        String x=s.trim();
        int lastSpace=x.lastIndexOf(" ");
        return x.length()-lastSpace-1;
    }

}