// Time O(1) || Space O(1)
class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int rowIdx = 0; rowIdx < board.length; rowIdx++){
            Map<Character, Boolean> row = new HashMap<Character, Boolean>();
            for(int colIdx = 0; colIdx < board[0].length; colIdx++){
                if(board[rowIdx][colIdx] == '.') continue;
                else if(row.containsKey(board[rowIdx][colIdx])) return false;
                else row.put(board[rowIdx][colIdx], true);
            }
            
        }   
        for(int colIdx = 0; colIdx < board[0].length; colIdx++){
            Map<Character, Boolean> col = new HashMap<Character, Boolean>();
            for(int rowIdx = 0; rowIdx < board.length; rowIdx++){
                if(board[rowIdx][colIdx] == '.') continue;
                else if(col.containsKey(board[rowIdx][colIdx])) return false;
                else col.put(board[rowIdx][colIdx], true);
            }
        }  

        if(!checKSubgrid(board)) return false;
        return true;  
    }
    
    public boolean checKSubgrid(char[][] board){
        for(int fullgrid = 0; fullgrid < 3; fullgrid++){
            for(int subgridId = 0; subgridId < 3; subgridId++){
                Map<Character, Boolean> subgrid = new HashMap<Character, Boolean>();
                for(int rowIdx = 0; rowIdx < 3; rowIdx++){
                    for(int colIdx = 0; colIdx < 3; colIdx++){
                        int rowToCheck = (fullgrid * 3 + rowIdx);
                        int colToCheck = (subgridId * 3 + colIdx);
                        System.out.println(rowToCheck + " " + colToCheck );
                        if(board[rowToCheck][colToCheck] == '.') continue;
                        else if(subgrid.containsKey(board[rowToCheck][colToCheck])) return false;
                        else subgrid.put(board[rowToCheck][colToCheck], true);
                    }
                }
            }
        }
        return true;
    }
}