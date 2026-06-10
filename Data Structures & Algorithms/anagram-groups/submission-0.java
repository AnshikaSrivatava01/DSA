class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> res = new HashMap<>();
        for (String s : strs) {
            char[] charArr = s.toCharArray();
            Arrays.sort(charArr);
            String str = new String(charArr);
            res.putIfAbsent(str, new ArrayList<>());
            res.get(str).add(s);
        }
        return new ArrayList<>(res.values());
    }
}
