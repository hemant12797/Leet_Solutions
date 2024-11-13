class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int i=0;
        int j=0; 
        int cookie=0;
        while(j<g.length && i<s.length){
            if(s[i] >= g[j]){ 
                cookie++;
                j++;
            }
            i++;
        }
        return cookie;
    }
}