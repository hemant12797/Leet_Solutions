class Solution {
    public String maximumOddBinaryNumber(String s) {
        int count=0;
        for (char ch : s.toCharArray()) {
            if (ch == '1') count++;
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<count-1;i++){
            sb.append('1');
        }
        for(int i=0;i<(s.length()-count);i++){
            sb.append('0');
        }
        sb.append('1');
        return sb.toString();
    }
}
