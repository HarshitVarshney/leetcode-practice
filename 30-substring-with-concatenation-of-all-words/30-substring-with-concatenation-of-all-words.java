class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        
        List<Integer> indicies = new ArrayList<>();
        Map<String, Integer> wordmap = new HashMap<>();
        int len = words[0].length();
        int wordCount = words.length;
        int stringLen = s.length();
        for(String word: words) {
           wordmap.put(word, wordmap.getOrDefault(word, 0)+1); 
        }
        
        
        for (int i=0; i<stringLen - len*wordCount +1 ; i++ ) {
            final Map<String, Integer> seen = new HashMap<>();
            int j=0;
            while (j<wordCount) {
                final String word = s.substring(i + j*len, i + (j+1)*len);
                if (wordmap.containsKey(word)) {
                   seen.put(word, seen.getOrDefault(word, 0) + 1);
                    if (seen.get(word) > wordmap.getOrDefault(word, 0)) {
                        break;
                    }
                } else {
                    break;
                }
                j++;
            }
            if (j==wordCount){
                indicies.add(i);
            }
            
        }
        
        return indicies;
        
        
        
    }
}