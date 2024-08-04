class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        if(n == 1) {
            return s;
        }
        int max = 0;
        String str = s.substring(0, max+1);
        for(int i=0; i<n; i++) {
            int l, r;

            //Palindrome is odd (ex: aba)
            l = i;
            r = i;
            while(l>=0 && r<n && s.charAt(l) == s.charAt(r)) {
                if(r - l + 1 > max) {
                    str = s.substring(l, r + 1);
                    max = r - l + 1;
                }
                l -= 1;
                r += 1;
            }

            //Palindrome is even (ex: abb)
            l = i;
            r = i+1;
            while(l>=0 && r<n && s.charAt(l) == s.charAt(r)) {
                if(r - l + 1 > max) {
                    str = s.substring(l, r + 1);
                    max = r - l + 1;
                }
                l -= 1;
                r += 1;
            }
        }
        return str;
    }
}