class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(); // min heap
        for (int num : nums) {
            pq.add(num);
            if (pq.size() > k) {
                pq.poll(); // remove smallest
            }
        }
        return pq.peek(); //as that will be the smallest or kth largest number
    }
}