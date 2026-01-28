class Solution {
    public void sortColors(int[] nums) {
        int low=0, high=nums.length-1, curr=0;
        while(curr<=high){
            if(nums[curr]==0){
                swap(nums,low,curr);
                low++;
                curr++;
            }
            else if(nums[curr]==1){
                curr++;
            }
            else{
                swap(nums,high,curr);
                high--;
            }
        }
    }
        void swap(int[] nums, int i, int j){
            int temp= nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
        }

}