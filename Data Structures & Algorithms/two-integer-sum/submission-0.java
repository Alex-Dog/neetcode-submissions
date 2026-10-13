class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> results = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            Integer result = results.get(num);
            if (result != null) {
                return new int[]{result, i};
            }
            results.put(target - num, i);
        }
        return new int[]{};
    }
}
