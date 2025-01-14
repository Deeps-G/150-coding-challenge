class Solution {
    public int majorityElement(int[] nums) {
        int count=0;
        int k=0;
        int n=nums.length;
        for(int i: nums){
            if(count==0){
                k=i;
            }
            count+=(i==k)?1:-1;
               
            }
            return k;
        }
        }
        