class Solution {
    public int countCharacters(String[] words, String chars) {
        
        Map<Character, Integer> inputToCountMap = new HashMap<>();
    
        for (int i=0; i<chars.length(); i++) {
          inputToCountMap.put(chars.charAt(i), inputToCountMap.getOrDefault(chars.charAt(i),0)+ 1);
        }
    
    
        boolean flag = true;
        int count = 0;
    
        for (String word: words) {

          Map<Character, Integer> wordMap = new HashMap<>();
          flag= true;
          for (int i=0; i<word.length();i++) {
            wordMap.put(word.charAt(i), wordMap.getOrDefault(word.charAt(i),0)+ 1);
          }

          for (Map.Entry<Character, Integer> entry : wordMap.entrySet()) {
           if (entry.getValue() > inputToCountMap.getOrDefault(entry.getKey(),0)) { 
              flag = false;
            } 
          }

          if (flag)
           count = count + word.length();

        }

        return count;
    }
}