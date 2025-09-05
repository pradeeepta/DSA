class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            numMap.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++){
            int sum = target - nums[i];
            if (numMap.containsKey(sum) && numMap.get(sum) != i){
                return new int[]{i, numMap.get(sum)};
            }
        }
        return null;
    }
}