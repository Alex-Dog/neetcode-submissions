class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> occurences = new HashMap<>();
        for (String str: strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String results = new String(chars);
            occurences.putIfAbsent(results, new ArrayList<>());
            occurences.get(results).add(str);
        }
        return new ArrayList<>(occurences.values());
    }
}
