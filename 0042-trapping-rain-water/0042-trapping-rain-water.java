class Solution {
    public int trap(int[] height) {
        int count=0;
        int left=0, right=height.length-1;
        int leftmax=0, rightmax=height[right];
        if(height==null ||height.length==0){
            return 0;
        }
        while(left<right){
            if (height[left] < height[right]) {
                if (height[left] >= leftmax) {
                    leftmax = height[left];
                } 
                else {
                    count += leftmax - height[left];
                }
                left++;
            } 
            else {
                if (height[right] >= rightmax) {
                    rightmax = height[right];
                } 
                else {
                    count += rightmax - height[right];
                }
                right--;
            }
        }
        
        return count;
            
        
    }
}
