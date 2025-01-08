class Solution {
    public String removeStars(String s) {
        char k;
        StringBuilder s1=new StringBuilder();
        for(int i=0;i<s.length();i++){
            k=s.charAt(i);
            if(k!='*'){
                s1.append(k);
            }
            else {
                s1.deleteCharAt(s1.length()-1);
            }
        }
        return s1.toString();        
    }
}