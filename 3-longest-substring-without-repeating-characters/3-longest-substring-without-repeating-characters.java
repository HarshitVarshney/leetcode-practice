class Solution {
    public int lengthOfLongestSubstring(String s) {
        
//         Map<Character, Integer> hm = new HashMap<>();
//         int maxLen = 0;
//         int start = 0;
//         for (int i=0; i<s.length(); i++) {
//             if (!hm.containsKey(s.charAt(i))) {
//                 //System.out.println(s.charAt(i) + " "+ i);
//                 hm.put(s.charAt(i), i);
//             } else {
//                 start = hm.get(s.charAt(hm.get(s.charAt(i)) + 1));
//                 //System.out.println(start);
//                 hm.put(s.charAt(i), i);
//             }
//             // System.out.println("len");
//             // System.out.println(i - start+1);
//             maxLen = Math.max(maxLen, i - start+1);
//         }
     
//         return maxLen;
//     }
        
        
        if (s.length()==0) return 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int max=0;
        for (int i=0, j=0; i<s.length(); ++i){
            if (map.containsKey(s.charAt(i))){
                j = Math.max(j,map.get(s.charAt(i))+1);
            }
            map.put(s.charAt(i),i);
            max = Math.max(max,i-j+1);
        }
        return max;
    }
}