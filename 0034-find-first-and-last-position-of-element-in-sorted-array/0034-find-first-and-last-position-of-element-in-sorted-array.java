class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first=lowerBound(nums,target);
        int last=lowerBound(nums,target+1)-1;
        if(first==nums.length|| nums[first]!= target){
            return new int[]{-1,-1};
        }
        return new int[]{first,last};
        }
    private int lowerBound(int[] nums, int target){
        int left=0, right=nums.length;
        while(left<right){
            int mid=left+(right-left)/2;
            if(nums[mid]<target) left=mid+1;
            else right=mid;
        }
        return left;
    }
    }