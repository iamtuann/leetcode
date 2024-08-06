class Solution {
    public int reverse(int x) {
        // if(x < 10 && x > -10) return x;
        // int temp = x >= 0 ? x : x * (-1);
        // String str = Integer.toString(temp);
        // int res = 0;
        // for(int i=0; i<str.length(); i++) {
        //     res += (str.charAt(i) - '0') * Math.pow(10, i);
        //     if (res >= Integer.MAX_VALUE) {
        //         return 0;
        //     }
        // }
        // return x >=0 ? res : res * (-1);
               
         long reversed = 0;
        while (x != 0) {
            reversed = reversed * 10 + x % 10;
            x /= 10;
            if (reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE) {
                return 0;
            }
        }
        return (int) reversed;
    }
}
