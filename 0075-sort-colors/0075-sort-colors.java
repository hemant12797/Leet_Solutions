class Solution {
    public void sortColors(int[] nums) {
        int k=0;
        for(int i=0;i<nums.length -1;i++){
            for(int j=0;j<nums.length-i-1;j++){
                if(nums[j]>nums[j+1]){
                    k=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=k;
                    
                }
            }
        } 
    }
}