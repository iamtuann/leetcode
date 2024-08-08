class Solution {
    public int myAtoi(String s) {
        String tmp = s.trim();
        long result = 0;
        int sign = 1;
        int i = 0;

        if(tmp.length() == 0) return 0;
        
        if(tmp.charAt(i) == '-') {
            sign = -1;
            i++;
        } else if(tmp.charAt(i) == '+') {
            i++;
        }
        while(i<tmp.length()) {
            if(Character.isDigit(tmp.charAt(i))) {
                result = result * 10 + (tmp.charAt(i) - '0');
                if(result>Integer.MAX_VALUE && sign == 1) {
                    return Integer.MAX_VALUE;
                } else if ((-1) *result < Integer.MIN_VALUE && sign == -1) {
                    return Integer.MIN_VALUE;
                }
                i++;
            } else {
                return (int) result * sign;
            }
        }
        return (int) result * sign;
    }
}
