class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> answer = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();

        for(int i = 0; i < strs.length; i++) {
            int[] freq = new int[26];

            for(int j = 0; j < strs[i].length(); j++) {
                int indexAt = strs[i].charAt(j) - 'a';

                freq[indexAt]++;
            }

            StringBuilder sb = new StringBuilder();
            
            for (int count : freq) {
                sb.append(count);
                sb.append(",");
            }
            
            String key = sb.toString();
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }

            List<String> listToInsert = map.get(key);

            listToInsert.add(strs[i]); 
            
            map.put(key, listToInsert);
        }
    
        return new ArrayList<>(map.values());
    }
}
