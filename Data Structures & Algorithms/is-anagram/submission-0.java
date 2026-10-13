class Solution {
    public boolean isAnagram(String s, String t) {
        List<Character> sChars = s.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
        List<Character> tChars = t.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
        for (Character c : sChars) {
            if (!tChars.remove(c)) {
                return false;
            }
        }
        return tChars.size() == 0;
    }
}
