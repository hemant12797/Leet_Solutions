class Solution {
    public static final int[][] DIRECTIONS = {
        { 0, 1 }, { 0, -1 }, { 1, 0 }, { -1, 0 }
    };

    public int minimumObstacles(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        int[][] dist = new int[n][m];
        for (int[] row : dist) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }
        dist[0][0] = grid[0][0];

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> Integer.compare(a[0], b[0]));
        pq.add(new int[] { dist[0][0], 0, 0 });

        while (!pq.isEmpty()) {
            int[] curr = pq.poll();
            int weight = curr[0];
            int row = curr[1];
            int col = curr[2];

            // If we reached the target cell, return the weight
            if (row == n - 1 && col == m - 1) {
                return weight;
            }

            for (int[] direction : DIRECTIONS) {
                int newRow = row + direction[0];
                int newCol = col + direction[1];

                if (newRow >= 0 && newCol >= 0 && newRow < n && newCol < m) {
                    int newWeight = weight + grid[newRow][newCol];
                    if (newWeight < dist[newRow][newCol]) {
                        dist[newRow][newCol] = newWeight;
                        pq.add(new int[] { newWeight, newRow, newCol });
                    }
                }
            }
        }

        return dist[n - 1][m - 1];
    }
}