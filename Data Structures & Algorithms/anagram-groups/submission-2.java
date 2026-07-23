class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hashMap = new HashMap<>();

        for(String currStr : strs) {
            String sortedString = Stream.of(currStr.split(""))
            .sorted()
            .collect(Collectors.joining());

            List<String> currList = hashMap.getOrDefault(sortedString, new ArrayList<>());
            currList.add(currStr);

            hashMap.put(sortedString, currList);
        }

        return new ArrayList<>(hashMap.values());
    }
}
