class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character>[] rowSets = new HashSet[board.length];
        HashSet<Character>[] colSets = new HashSet[board.length];
        HashSet<Character>[] boxSets = new HashSet[board.length];
        
        for(int i = 0; i < board.length; i++) {
            rowSets[i] = new HashSet<>();
            colSets[i] = new HashSet<>();
            boxSets[i] = new HashSet<>();
        }

        for(int i = 0; i < board.length; i++) {
            HashSet<Character> rowHashSet = rowSets[i];
            for(int j = 0; j < board[i].length; j++) {
                if (board[i][j] == '.') continue;
                
                HashSet<Character> colHashSet = colSets[j];
                int boxRow = i / 3;
                int boxCol = j / 3;

                int boxIdx = boxRow + 3*boxCol;

                HashSet<Character> boxHashSet = boxSets[boxIdx];

                if(
                    rowHashSet.contains(board[i][j]) ||
                    colHashSet.contains(board[i][j]) ||
                    boxHashSet.contains(board[i][j])
                ) {
                    return false;
                } else {
                    rowHashSet.add(board[i][j]);
                    colHashSet.add(board[i][j]);
                    boxHashSet.add(board[i][j]);
                }       
            }
        }

        return true;
    }
}
