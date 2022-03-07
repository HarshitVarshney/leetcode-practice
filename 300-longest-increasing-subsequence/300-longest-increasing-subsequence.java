class Solution {
    public int lengthOfLIS(int[] nums) {
        
        if(nums.length == 0 || nums == null){
            return 0;
        }
        
        int []dp = new int[nums.length];
        
        Arrays.fill(dp, 1);
        int max = 1;
        
        for (int i = 1; i<nums.length; i++) {
            for (int j=0; j<i;j++) {
                if (nums[i] > nums[j]){
                    dp[i] = Math.max(1 + dp[j], dp[i]);
                } 
            }
            
            max = Math.max(max, dp[i]);
        }
       
        return max;
    }
}