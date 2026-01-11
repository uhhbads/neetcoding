class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> hash = new HashMap<>();

        for(String str : strs){
            int[] count = new int[26];

            for(char c : str.toCharArray()){
                count[c - 'a']++;
            }

            String letters = Arrays.toString(count);
            hash.putIfAbsent(letters, new ArrayList<String>());
            hash.get(letters).add(str);
        }
        return new ArrayList<List<String>>(hash.values());
    }
}
