class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        int biggestChain = 0;
        int currentChain = 1;
        for (int num : set) {
            if (!set.contains(num - 1)) {
                currentChain = 1;
                while (set.contains(num + currentChain)) {
                    currentChain++;
                }
            if (currentChain > biggestChain) {
                biggestChain = currentChain;
                currentChain = 1;
            }
            }
        }
        return biggestChain;
        
    }
}
