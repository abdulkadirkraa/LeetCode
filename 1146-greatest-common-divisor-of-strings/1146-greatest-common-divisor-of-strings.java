class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1)){
            return "";
        }
        int gcdos = gcdOS(str1.length(), str2.length());
        return str1.substring(0, gcdos);
    }

    private int gcdOS(int a, int b) {
        return b == 0 ? a : gcdOS(b, a % b);
    }
}