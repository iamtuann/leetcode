class Solution {
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int max = 0;
        while(l<r) {
            int x = r - l;
            int y = Math.min(height[l], height[r]);
            int s = x * y;
            if (s > max) max = s;
            if(height[l] < height[r]) l++;
            else r--;
        }
        return max;
    }
}
