class Solution {
    public int romanToInt(String s) {
        int[] n = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        String[] c = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
        int ans = 0;
        int i = 0;
        int j = 0;
        while (j < s.length()) {
            if (s.substring(j, j + 1).equals(c[i])) {
                ans += n[i];
                j++;
            } else if (j < (s.length() - 1) && s.substring(j, j + 2).equals(c[i])) {
                ans += n[i];
                j += 2;
            } else {
                i++;
            }
        }
        return ans;
    }
}
