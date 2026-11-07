class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Arrays.sort(nums);
        HashMap<Integer, Integer> values = new HashMap<>();
        for (int num : nums) {
            values.put(num, values.getOrDefault(num, 0) + 1);
        }
        List<Map.Entry<Integer, Integer>> results = new ArrayList(values.entrySet());
        results.sort(Map.Entry.comparingByValue());
        int[] resultArray = new int[k];
        for (int i = 0; i < k; i++) {
            resultArray[i] = results.get((results.size() - 1) - i).getKey();
        }        
        return resultArray;
    }
}
