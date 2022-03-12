class Solution {
    public int subarraySum(int[] nums, int k) {
        
        int sum = 0, result = 0;
        Map<Integer, Integer> preSum = new HashMap<>();
        preSum.put(0, 1);
        
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            System.out.println("sum: " + sum);
            if (preSum.containsKey(sum - k)) {
                System.out.println("preSum.get(sum - k): " + preSum.get(sum - k));
                result += preSum.get(sum - k);
                System.out.println("result: " + result);
            }
            preSum.put(sum, preSum.getOrDefault(sum, 0) + 1);
        }
        
        return result;
    }
        
}