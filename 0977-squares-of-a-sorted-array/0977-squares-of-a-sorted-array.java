class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] resultArr = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            resultArr[i]= nums[i]*nums[i];
        }
        Arrays.sort(resultArr);
        return resultArr;
    }
}