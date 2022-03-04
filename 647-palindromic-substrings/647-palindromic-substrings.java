class Solution {
        int count=0;
    public int countSubstrings(String input) {
    
         int startIndex = 0;
        int endIndex = input.length();
         for (int i=startIndex; i<endIndex; i++) {
             ispalindrome(input, i, i );
             ispalindrome(input, i, i+1);
        }
        return count;
    }
    
    void ispalindrome(String input, int left, int right) {
        
  while (left>=0 && right<input.length() && input.charAt(left) == input.charAt(right)) {
       left--;
       right++;
       count++;
     } 
}
}