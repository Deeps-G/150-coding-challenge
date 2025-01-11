class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int Num1Index=m-1;
        int Num2Index=n-1;
        int mergedInd=m+n-1;
        while(Num1Index>=0 && Num2Index>=0){
            if (nums1[Num1Index]> nums2[Num2Index]){
                nums1[mergedInd--]=nums1[Num1Index--];
            }
            else{
                nums1[mergedInd--]=nums2[Num2Index--];
            }
        }
        while(Num2Index>=0){
            nums1[mergedInd--]=nums2[Num2Index--];
        }
    }
}