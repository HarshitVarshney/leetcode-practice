class Solution {
    public int change(int amount, int[] coins) {
        
       // int count =0;
        int [] dp = new int[amount+1];
        Arrays.fill(dp, 0);
        dp[0] = 1;
        for (int i=0; i<coins.length; i++) {
            for (int j=coins[i]; j<=amount;j++) {
                dp[j] += dp[j- coins[i]];
            }
        }
        return dp[amount];
        
        
    }
    
//     void countChange (int balance, int[]coins, int count) {
        
//         if (balance ==0 ) {
//             count++;
//             return; 
//         }
//         if 
        
//         for (int i =0 ; i<coins.length; i++) {
//             countChange(balance-coins[i], coins, count);
//         }
        
//     }
}