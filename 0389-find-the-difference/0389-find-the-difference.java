class Solution {
    public char findTheDifference(String s, String t) {
        int su=0,tu=0;
        for(int i=0;i<s.length();i++){
            su+=s.charAt(i);
        }
        for(int i=0;i<t.length();i++){
            tu+=t.charAt(i);
        }
        return (char) (tu-su);
    }
}