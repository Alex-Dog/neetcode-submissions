class Solution {
    public int[] productExceptSelf(int[] nums) {
        int sumOfWholeArray = 1;
        int zeroPos = -1;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (num != 0) {
                sumOfWholeArray *= num;
            } else {
                if (zeroPos != -1) {
                    return new int[nums.length];
                }
                zeroPos = i;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                nums[i] = sumOfWholeArray;
                continue;
            }
            if (zeroPos != -1 && zeroPos != i) {
                nums[i] = 0;
            } else {
                nums[i] = sumOfWholeArray / nums[i];
            }
        }
        return nums;
        
    }
}  
