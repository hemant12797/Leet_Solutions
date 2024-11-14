class Solution {
    public int minimizedMaximum(int n, int[] quantities) {
        int l=1,r=fMax(quantities),ans=0;
        while(l<=r){
            int m = (r+l)/2;
            if(helper(m,quantities,n)){
                ans = m;r=m-1;
            }
            else l=m+1;
        }
        return ans;
    }
    public int fMax(int[] a){
        int ans=0;
        for(int i:a) ans=Math.max(ans,i);
        return ans;
    }
    public boolean helper(int m,int[] a,int n){
            int s =0;
            for(int i:a){
                s += Math.ceil(i/(double)m);
            }
            return s<=n;
    }
}