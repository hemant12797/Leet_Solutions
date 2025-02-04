class Solution {
    public int[] diStringMatch(String s) {
        int n = s.length();
        int p= 0, length = n;
        int[] arr = new int[n + 1];

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'I') {
                arr[i] = p++;
            } 
            else {
                arr[i] = length--;
            }
        }
        arr[n] = p;
        return arr;
    }
}
