class Solution {
    public String longestPalindrome(String s) {
      
        String result = "";
        int maxlen = 0;
        for (int i=0; i<s.length();i++) {
            int left = i;
            int right = i;
            //"babad"
            while(left>=0 && right<s.length() && s.charAt(left) == s.charAt(right)) {
                if (right - left + 1 > maxlen){
                    maxlen = right - left +1;
                    result = s.substring(left, right+1);
                }
                left--;
                right++;
            }
            
            left = i;
            right = i+1;
            
            
            while(left>=0 && right<s.length() && s.charAt(left) == s.charAt(right)) {
                if (right - left +1 > maxlen){
                    maxlen = right - left;
                    result = s.substring(left, right+1);
                }
                left--;
                right++;
            }
            
            
        }
        
        return result;
    }
    

}