public class Solution {
    public static boolean isPalindrome(String s) {
        String s1 = s.trim();
        String s2 = s1.toLowerCase().replaceAll("[^a-z0-9]", "");
        int l = 0;
        int r = s2.length() - 1;
        while (l <= r) {
            if (s2.charAt(l) != s2.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
