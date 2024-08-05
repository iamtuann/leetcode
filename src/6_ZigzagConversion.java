class Solution {
    public String convert(String s, int numRows) {
        int n = s.length();
        if(n < numRows) {
            return s;
        }
        StringBuffer[] sb = new StringBuffer[numRows];
        for (int i = 0; i < sb.length; i++) {
            sb[i] = new StringBuffer();
        }
        int i =0;
        while(i < n) {
            for(int j=0; j<numRows && i<n; j++) {
                sb[j].append(s.charAt(i));
                i++;
            }
            for(int j=numRows-2; j>0 && i<n; j--) {
                sb[j].append(s.charAt(i));
                i++;
            }
        }
        for (int j = 1; j < sb.length; j++) {
            sb[0].append(sb[j]);
        }
        return sb[0].toString();
    }
}