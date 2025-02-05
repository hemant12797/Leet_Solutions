class Solution {
    public int integerReplacement(int n) {
        int c = 0;
        long num = n;
        while (num > 1) {
            if (num % 2 == 0) {
                num /= 2;
            } else {
                if (num == 3 || ((num/2)%2) == 0) {
                    num--;
                } else {
                    num++;
                }
            }
            c++;
        }
        return c;
    }
}