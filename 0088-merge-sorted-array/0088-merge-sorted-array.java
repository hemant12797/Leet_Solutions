class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0,j=0;
        for(i=0;i<nums1.length;i++){
            if(nums1[i]<=0 && i>=m){
                nums1[i]=nums2[j++];
            }
        }
        Arrays.sort(nums1);
    
    }
}