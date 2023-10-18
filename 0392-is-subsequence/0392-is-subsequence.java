class Solution {
    public boolean isSubsequence(String s, String t){
        int i = 0;
        for(int j = 0;j<t.length() && i<s.length();j++)
            if(t.charAt(j) == s.charAt(i)) i++;
        return i == s.length();  
        /*
        int r=0;
        int size=s.length();
        for(int i=0;i<size;i++){
            for(int j=0;j<t.length();j++){
                if(s.charAt(i)==t.charAt(j)){
                    r++;
                }
                
            }
        }
        return r == size;
        */
        
    }

}