class Solution {
    public int[] rotate(int[] nums, int k) {
        int[] nums1 = new int[nums.length];
        int n = nums.length - k%nums.length; 
        if(nums.length<=1 | k==0){
            return nums;
        }
        if(nums.length==k){
            return nums;
        }

        for (int i = 0; i < nums.length; i++) {
            nums1[i] = nums[n];
            n++;
            if (n == nums.length) {
                n = 0;
            }
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=nums1[i];
        }
        return nums;
    }
}
