class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> result = new HashSet<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++){
            Set<Integer> checker = new HashSet<>();
            for (int j = i + 1; j < nums.length; j++){
                int sum = -nums[i] - nums[j];

                if (checker.contains(sum)){
                    List<Integer> triplet = Arrays.asList(nums[i], nums[j], sum);
                    Collections.sort(triplet);
                    result.add(triplet);
                }

                checker.add(nums[j]);

            }
        }
        return new ArrayList<>(result);
    }
}