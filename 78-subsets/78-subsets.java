class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        getSubset(nums, result, new ArrayList<Integer>(), 0);
        return result;
    }
    
    
    private void getSubset (int[] nums,List<List<Integer>> result, List<Integer> current, int start ){
        result.add(new ArrayList<>(current));
        
        for (int i=start; i<nums.length;i++) {
            current.add(nums[i]);
            getSubset(nums, result, current, i+1);
            current.remove(current.size()-1);
        }
    }
    
}