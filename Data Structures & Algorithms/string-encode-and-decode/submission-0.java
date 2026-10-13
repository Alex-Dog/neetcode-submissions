class Solution {

    public static String encode(List<String> strs) {
        StringBuilder fullStr = new StringBuilder();
        for (String str : strs) {
            fullStr.append(str.length());
            fullStr.append("|");
        }
        fullStr.append("$");
        for (String str : strs) {
            fullStr.append(str);
        }
        fullStr.append("$");
    return fullStr.toString();
    }

    public static List<String> decode(String str) {
        List<Integer> parts = new ArrayList<>();
        int startIndex = -1;
        for (String chunk : str.split("\\|")) {
            if (chunk.contains("$")) {
                startIndex = str.indexOf("|$") +  2;
                break;
            }
            parts.add(Integer.parseInt(chunk));
        }   
        List<String> results = new ArrayList<>();
        for (int part : parts) {
            results.add(str.substring(startIndex, startIndex + part));
            startIndex += part;
        }
        return results;
    }
}
