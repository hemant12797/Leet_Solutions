class Solution {
    public int maxMoves(int[][] grid) {
        int maxRow = grid.length - 1;
        int maxCol = grid[0].length - 1;
        int[][] memory = new int[maxRow + 1][maxCol + 1];
        
        for (int[] row : memory) Arrays.fill(row, -1);

        int res = 0;
        for (int i = 0; i <= maxRow; i++) {
            int tempRes = recursion(grid, i, 0, maxRow, maxCol, memory);
            res = Math.max(res, tempRes);
        }

        return res;
    }

    int recursion(int[][] grid, int row, int col, int maxRow, int maxCol, int[][] memory) {
        if (row < 0 || col > maxCol || row > maxRow) return 0;

        if (memory[row][col] != -1) return memory[row][col];

        int diagonalUp = 0, right = 0, diagonalDown = 0;

        if (row - 1 >= 0 && col + 1 <= maxCol && grid[row - 1][col + 1] > grid[row][col]) {
            diagonalUp = 1 + recursion(grid, row - 1, col + 1, maxRow, maxCol, memory);
        }

        if (col + 1 <= maxCol && grid[row][col + 1] > grid[row][col]) {
            right = 1 + recursion(grid, row, col + 1, maxRow, maxCol, memory);
        }

        if (row + 1 <= maxRow && col + 1 <= maxCol && grid[row + 1][col + 1] > grid[row][col]) {
            diagonalDown = 1 + recursion(grid, row + 1, col + 1, maxRow, maxCol, memory);
        }

        return memory[row][col] = Math.max(diagonalUp, Math.max(right, diagonalDown));
    }
}