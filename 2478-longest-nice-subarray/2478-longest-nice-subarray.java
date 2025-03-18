class Solution {
    public int longestNiceSubarray(int[] nums) {
        int left = 0, bM = 0, maxLength = 0;

        for (int r = 0; r < nums.length; r++) {
            while ((bM & nums[r]) != 0) {
                bM ^= nums[left];  
                left++;
            }

            bM |= nums[r];

            maxLength = Math.max(maxLength, r - left + 1);
        }
        
        return maxLength;
    }
}