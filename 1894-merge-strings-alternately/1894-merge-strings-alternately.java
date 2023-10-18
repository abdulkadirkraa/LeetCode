class Solution {
    public String mergeAlternately(String word1, String word2) {
        String output="";
        int i=0;
        if(word1.length()>word2.length()){
            while(i<word2.length()){
                output+=word1.charAt(i);
                output+=word2.charAt(i);
                i++;
            }
            while(i<word1.length()){
                output+=word1.charAt(i);
                i++;
            }
        }else{
            while(i<word1.length()){
                output+=word1.charAt(i);
                output+=word2.charAt(i);
                i++;
            }
            while(i<word2.length()){
                output+=word2.charAt(i);
                i++;
            }
        }

        return output;
        
    }
}