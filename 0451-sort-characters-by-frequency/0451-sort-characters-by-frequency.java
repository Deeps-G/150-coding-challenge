class Solution {
    public String frequencySort(String s) {
        
        // Step 1: Count frequency
        HashMap<Character, Integer> map = new HashMap<>();
        
        for(char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        
        // Step 2: Max Heap based on frequency
        PriorityQueue<Character> maxHeap = 
            new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));
        
        maxHeap.addAll(map.keySet());
        
        // Step 3: Build result
        StringBuilder result = new StringBuilder();
        
        while(!maxHeap.isEmpty()) {
            char ch = maxHeap.poll();
            int freq = map.get(ch);
            
            while(freq-- > 0) {
                result.append(ch);
            }
        }
        
        return result.toString();
    }
}
