class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int k = 0;
        int i = 0;
        while (k < n) {
            if (nums[k] != 0) {
                nums[i] = nums[k];
                i++;
            }
            k++;
        }
        while (i < n) {
            nums[i++] = 0;
        }
    }
}