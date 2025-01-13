class Solution {
    public int minimumLength(String s) {
        int[] f = new int[26]; 
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            int n = s.charAt(i) - 'a'; 
            f[n]++; 
            if (f[n] > 2 && f[n] % 2 == 1) {
                count += 2;
            }
        }
        return s.length() - count;
    }
}