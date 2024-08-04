class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for(int i = 0; i<n; i++) {
            int diff = target - nums[i];
            for(int j = i+1; j<n; j++) {
                if(nums[j] == diff) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{0, 0};
    }
}