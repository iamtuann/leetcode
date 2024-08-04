class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int max = 0;
        Set<Character> set = new HashSet();
        int start = 0;
        for(int end = 0; end<n; end++) {
            if(!set.contains(s.charAt(end))) {
                set.add(s.charAt(end));
                max = max > (end-start+1) ? max : (end-start+1);
            } else {
                while(set.contains(s.charAt(end))) {
                    set.remove(s.charAt(start));
                    start++;
                }
                set.add(s.charAt(end));
            }
        }
        return max;
    }
}