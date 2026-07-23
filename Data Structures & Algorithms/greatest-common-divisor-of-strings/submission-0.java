class Solution {
    public String gcdOfStrings(String str1, String str2) {
        int gcd = greatestCommonDivisor(str1.length(), str2.length());

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str1.charAt(i % gcd))
                return "";
        }
        for (int i = 0; i < str2.length(); i++) {
            if (str2.charAt(i) != str1.charAt(i % gcd))
                return "";
        }
        return str1.substring(0, gcd);
    }
    public static int greatestCommonDivisor(int a, int b) {
        return b == 0 ? a : greatestCommonDivisor(b, a % b);
    }
}