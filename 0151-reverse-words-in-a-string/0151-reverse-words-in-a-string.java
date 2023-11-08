class Solution {
    public String reverseWords(String s) {
        StringBuilder s1 = new StringBuilder();
        String s2="";
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)!=' ' ){
                s1.append(s.charAt(i));
                if(i==0){
                    s1.reverse();
                    s1.append(" ");
                    s2+=s1.toString();
                    s1.setLength(0);
                }
            }else{
                if(s1.length()==0){
                    continue;
                }else{
                    s1.reverse();
                    s1.append(" ");
                    s2+=s1.toString();
                    s1.setLength(0);
                }
            }
            /*
            if(s.charAt(i)==' ' || i==0){
                if(s1.length()==0){
                    continue;
                }else{
                    //s1=
                    s1.reverse();
                    s1.append(" ");
                    s2+=s1.toString();
                    s1.setLength(0);
                }
            }else{
                s1.append(s.charAt(i));
            }
            */
        }
        return s2.substring(0, s2.length() - 1);
    }

}