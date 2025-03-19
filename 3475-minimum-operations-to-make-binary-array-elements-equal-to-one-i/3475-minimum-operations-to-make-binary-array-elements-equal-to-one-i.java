class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length;
        int cnt = 0;

        for (int i = 0; i <= n - 3; i++) {
            if (nums[i] == 0) {
                for (int j = i; j < i + 3; j++) {
                    nums[j] ^= 1;
                }
                cnt++;
            }
        }

        for (int num : nums) {
            if (num == 0) return -1;
        }

        return cnt;
    }
}