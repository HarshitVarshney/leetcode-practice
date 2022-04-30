class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> tempList = new ArrayList<>();
        getCombinationSum(candidates, target, 0, result, tempList);
        return result;
        
    }
    
    void getCombinationSum(int[] candidates, int target, int startIndex, List<List<Integer>> result, List<Integer> tempList) {
        
        if (target<0) {
            return;
        }
        if (target ==0) {
            result.add(new ArrayList<Integer>(tempList));
        }
        
        
        for (int i=startIndex; i<candidates.length; i++) {
            tempList.add(candidates[i]);
            int remainingTarget = target -candidates [i]; 
            getCombinationSum(candidates,remainingTarget, i, result, tempList );
            tempList.remove(tempList.size()-1);
        }
    }
}