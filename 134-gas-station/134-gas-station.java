class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalGas = 0; 
        int totalCost = 0;
        for (int i=0; i<gas.length; i++) {
            totalGas += gas[i];
            totalCost += cost[i];
        }
        
        if (totalCost>totalGas) {
            return -1;
        }
        
        int fuelLeft = 0;
        int result = 0;
        for (int i=0; i<gas.length ; i++) {
            fuelLeft += gas[i] - cost[i];
            if (fuelLeft<0){
                result = i+1;
                fuelLeft = 0;
            }
        }
        
        return result; 
    }
}