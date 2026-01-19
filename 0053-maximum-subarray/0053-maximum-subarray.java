class Solution {
    public int maxSubArray(int[] nums) {
        // int subarr[];
        int maxArr=nums[0];
        int CurrentSum=nums[0];
        for(int i=1;i<nums.length;i++){
            CurrentSum=Math.max(nums[i],CurrentSum + nums[i]);
            maxArr=Math.max(CurrentSum,maxArr);
        }
    
       return maxArr;
    }
    
}