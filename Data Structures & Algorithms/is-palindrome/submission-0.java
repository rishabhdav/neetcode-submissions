class Solution {
    public boolean isPalindrome(String s) {
        int start = 0;
        int e = s.length() - 1;
        while (start <= e) {
            if (!isValid(s.charAt(start))) {
                start++;
            }
             else if (!isValid(s.charAt(e))) {
                e--;
            }

            else {
                if (!isSame(s.charAt(start), s.charAt(e))) {
                    return false;
                } else {
                    start++;
                    e--;
                }
            }
        }
        return true;
    }

    public boolean isValid(char temp) {
        if ((temp >= 'a' && temp <= 'z') || (temp >= 'A' && temp <= 'Z')
            || (temp >= '0' && temp <= '9'))
            return true;
        else
            return false;
    }

    public boolean isSame(char a, char b) {
        if (a >= 'A' && a <= 'Z')
            a = (char) (a + 32);
        if (b >= 'A' && b <= 'Z')
            b = (char) (b + 32);
        return a == b;
    }
}
