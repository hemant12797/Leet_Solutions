class Solution {
    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        int n=nums.length;
        int rows=n/3;
        int arr[][]=new int[rows][3];
        for(int i=0;i<n;i++){
            int first=nums[(i/3)*3];
            if(nums[i]-first<=k){
               arr[i/3][i%3]=nums[i];
            }else{
                return new int[0][0];
            }
        }
        return arr;
    }
}