class Solution {
    public String reverseVowels(String s) {
        StringBuilder str=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' ||
                c=='A' || c=='E' || c== 'I' || c=='O' || c=='U'){
                   str.append(c);
                }
        }
        String rvowel=str.reverse().toString();

        int k=0;
        char[] resultArray = new char[s.length()];
        for (int j = 0; j < s.length(); j++) {
            char c = s.charAt(j);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                c=='A' || c=='E' || c== 'I' || c=='O' || c=='U') {
                resultArray[j] = rvowel.charAt(k);
                k++;
            } else {
                resultArray[j] = c;
            }
        }
        return new String(resultArray);
    }

}