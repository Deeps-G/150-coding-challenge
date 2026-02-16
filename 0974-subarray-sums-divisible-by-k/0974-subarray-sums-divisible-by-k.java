import java.util.HashMap;

class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        map.put(0, 1);  // Important: handles subarrays starting from index 0
        
        int prefixSum = 0;
        int count = 0;
        
        for (int num : nums) {
            prefixSum += num;
            
            int remainder = prefixSum % k;
            
            // handle negative remainder
            if (remainder < 0) {
                remainder += k;
            }
            
            if (map.containsKey(remainder)) {
                count += map.get(remainder);
            }
            
            map.put(remainder, map.getOrDefault(remainder, 0) + 1);
        }
        
        return count;
    }
}