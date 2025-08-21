class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = null;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    ans = new int[] {i, j};
                    //return ans; // return immediately after finding the pair
                }
            }
        }
        return ans;
        //return new int[] {}; // return empty array if no solution
    }
}
