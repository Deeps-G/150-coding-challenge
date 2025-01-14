class Solution {
    public String reverseWords(String s) {
        String[] x =s.trim().split("\\s+");
        List<String> wordsList = new ArrayList<String>(Arrays.asList(x));
      
        // Reverse the order of the words in the list
        Collections.reverse(wordsList);
        String reversed = String.join(" ", wordsList);
        return reversed;
    }
}