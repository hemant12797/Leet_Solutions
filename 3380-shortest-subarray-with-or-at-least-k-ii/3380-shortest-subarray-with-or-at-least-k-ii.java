class Solution {
    public int minimumSubarrayLength(int[] nums, int k) {
        int n = nums.length;
        int left = 0, right = 0;
        int currOR = 0;
        int[] bitCnt = new int[32]; 
        int minLen = Integer.MAX_VALUE;

        for (right = 0; right < n; right++) {
            currOR |= nums[right]; 
            updateBitCnt(bitCnt, nums[right]);
            while (left<=right && currOR>=k) {
                minLen = Math.min(minLen, right - left + 1);
                currOR = removeLeft(currOR, bitCnt, nums[left]);
                left++;
            }
        }

        if (minLen != Integer.MAX_VALUE) return minLen;
        return -1;
    }
    private void updateBitCnt(int[] bitCnt, int num) {
        for (int bit = 0; bit < 32; bit++){
            if ((num & (1 << bit)) != 0) {
                bitCnt[bit]++;
            }
        }
    }
    private int removeLeft(int currOR, int[] bitCnt, int num) {
        int updatedOR = 0;
        for (int bit = 0; bit < 32; bit++) {
            if ((num & (1 << bit)) != 0) {
                bitCnt[bit]--;
            }
            if (bitCnt[bit] > 0) {
                updatedOR |= (1 << bit);
            }
        }
        return updatedOR;
    }
}