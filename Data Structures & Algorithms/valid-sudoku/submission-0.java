class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int row = 0; row < 9; row++) {
            Set<Character> found = new HashSet<>();
            for (int col = 0; col < 9; col++) {
                char c = board[row][col];
                if (c != '.' && found.contains(c)) {
                    return false;
                }
                found.add(c);
            }
        }

        for (int col = 0; col < 9; col++) {
            Set<Character> found = new HashSet<>();
            for (int row = 0; row < 9; row++) {
                char c = board[row][col];
                if (c != '.' && found.contains(c)) {
                    return false;
                }
                found.add(c);
            }
        }
        for (int i = 0; i < 9; i += 3) {
            for (int j = 0; j < 9; j += 3) {
                Set<Character> found = new HashSet<>();
                for (int row = i; row < i + 3; row++) {
                    for (int col = j; col < j + 3; col++) {
                        char c = board[row][col];
                        if (c != '.' && found.contains(c)) {
                            return false;
                        }
                        found.add(c);
                    }
                }
            }
        }
        return true;
    }
}
