class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int k=0;
        int p=1;
        int[] num = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                num[k]=nums[i];
                k=k+2;
            }
            else{
                num[p]=nums[i];
                p=p+2;
            }
        } 
        return num;       
    }
}