class Solution {
    public int characterReplacement(String s, int k) {
        
        int maxCount = 0;
        int maxLength = 0;
        int windowStart = 0;
        
        int []count = new int[26];
        for (int windowEnd = 0; windowEnd<s.length(); windowEnd++) {
            count[s.charAt(windowEnd)-'A']++;
            int currentCount = count[s.charAt(windowEnd)-'A'];
            maxCount = Math.max(maxCount, currentCount);
            
            while(windowEnd - windowStart - maxCount + 1 >k ) {
                count[s.charAt(windowStart)-'A']--;
                windowStart++;
            }
            maxLength = Math.max(maxLength, windowEnd - windowStart +1);
            
        }
        
        return maxLength;
    }
    
}