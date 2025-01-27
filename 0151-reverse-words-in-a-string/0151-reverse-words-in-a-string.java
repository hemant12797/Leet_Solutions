class Solution {
    public String reverseWords(String s) {
        s=s.trim()+' ';
        int l = s.length();
        String s1="",s2="";
        char k;
        for(int i=0;i<l;i++){
            k=s.charAt(i);
            if(k!=' '){
                s1=s1+k;
            }
            else{
                if(s1.isEmpty()) continue;
                s2=s1+' '+s2;
                s1="";
            }
        }
        return s2.trim();
    }
}
