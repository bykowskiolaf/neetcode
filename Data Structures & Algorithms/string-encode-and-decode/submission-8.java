class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();

        for(String str : strs) {
            sb.append(str.length());
            sb.append('#');
            sb.append(str);
        }

        return sb.toString();
    }

    public List<String> decode(String str) {
        if (str.isEmpty()) return new ArrayList<>(); 

        List<String> decodedStrs = new ArrayList<>();
    
        while (!str.equals("")) {
            Integer delimiterIndex = str.indexOf("#");
            Integer wordLength = Integer.parseInt(str.substring(0, delimiterIndex));

            String decodedStr = str.substring(delimiterIndex + 1, delimiterIndex + wordLength + 1);
            
            decodedStrs.add(decodedStr);
            
            str = str.substring(delimiterIndex + 1 + wordLength);
            System.out.println(str.length());

        }

        return decodedStrs;
    }
}
