class Solution {
    public boolean exist(char[][] board, String word) {
        boolean [][]visited = new boolean[board.length][board[0].length];
        for (int row = 0; row<board.length; row++) {
            for (int col = 0; col<board[0].length; col++){
                if (findWord(board, row, col, 0, word, visited)){
                    return true;
                }
            }
        }
        return false;
        
    }
    
    boolean findWord(char[][] board, int row, int col, int position, String word , boolean [][]visited ) {
          if (position == word.length()){
            return true;
        }
      
        if (row<0 || col<0 || row>=board.length || col>= board[0].length || visited[row][col]){
            return false;
        }
        
        if (board[row][col] != word.charAt(position)) {
            return false;
        }

        visited[row][col] = true;
        
        boolean result = findWord(board, row+1, col, position+1, word, visited) || 
            findWord(board, row, col+1, position+1, word, visited) ||
            findWord(board, row-1, col, position+1, word, visited) ||
            findWord(board, row, col-1, position+1, word, visited) ;
         visited[row][col] = false;
        return result;
       
    }
}