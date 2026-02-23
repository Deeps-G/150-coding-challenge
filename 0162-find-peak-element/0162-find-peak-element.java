class Solution {
    public int findPeakElement(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > nums[mid + 1]) {
                // descending peak is at mid or left side
                right = mid;
            } else {
                // ascending → peak is on right side
                left = mid + 1;
            }
        }
        return left;
    }
}