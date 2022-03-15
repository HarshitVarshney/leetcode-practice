class Solution {
    public List<String> generateParenthesis(int n) {
        
        int open = n;
        int close = n;
        List<String> result = new ArrayList();
        String pattern= "";
        getParenthesis(open, close, result, pattern);
        
        return result;
        
    
        
    }
    
    public void getParenthesis(int open, int close, List<String> result, String pattern){
          if (open ==0 && close==0){
            result.add(pattern);
            pattern = "";
            return;
        }

        if (open >0) {
            getParenthesis(open-1, close, result, pattern + "(");
        }
        if (close > open) {
            getParenthesis(open, close - 1, result, pattern + ")");
        }
        
    }
}