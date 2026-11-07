class Solution {
    public int[] productExceptSelf(int[] nums) {
        int sumOfWholeArray = 1;
        Set<Integer> zeros = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (num != 0) {
                sumOfWholeArray *= num;
            } else {
                zeros.add(i);
            }
        }
        if (zeros.size() >= 2) {
            return new int[nums.length];
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                nums[i] = sumOfWholeArray;
                continue;
            }
            if (zeros.size() == 1 && !zeros.contains(i)) {
                nums[i] = 0;
            } else {
                nums[i] = sumOfWholeArray / nums[i];
            }
        }
        return nums;
        
    }
}  
