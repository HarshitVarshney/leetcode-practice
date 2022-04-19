class Solution {
    public int uniquePaths(int m, int n) {
        int [][]path = new int[m][n];
        return uniquePathsHelper(m-1, n-1, path);
    }
    
    private int uniquePathsHelper(int m, int n, int[][]path) {
        if (m<0 || n<0) {
            return 0;
        }
        else if (m==0 || n==0) {
            return 1;
        }
        
        else if (path[m][n]>0){
            return path[m][n];
        } 
        else {
        path[m][n] = uniquePathsHelper(m-1, n, path) + uniquePathsHelper(m, n-1, path);
        return path[m][n];
        }
    }

}