
class Solution {
    // Encodes a list of strings to a single string.
    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String s : strs) {
            sb.append(s.length()).append("#").append(s);
        }
        return sb.toString();
    }

    // Decodes a single string to a list of strings.
    public List<String> decode(String s) {
        List<String> result = new ArrayList<>();
        int i = 0;
        while (i < s.length()) {
            // find the delimiter #
            int j = s.indexOf('#', i);
            int len = Integer.parseInt(s.substring(i, j));
            String str = s.substring(j + 1, j + 1 + len);
            result.add(str);
            i = j + 1 + len;
        }
        return result;
    }
}
