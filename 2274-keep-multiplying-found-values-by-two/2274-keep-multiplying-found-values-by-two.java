class Solution {
    public int findFinalValue(int[] nums, int original) {
        int k=0;
        Arrays.sort(nums);
        for(int i=0;i<=nums.length-1;i++){
            if(nums[i]==original){
                original=2*original;
                k=original;
            }
            else{
                k=original;
            }
        }
        return k;
    }
}