class Solution {
    public int maxEqualRowsAfterFlips(int[][] matrix) {
        return Arrays.stream(matrix)
            .map(row -> { 
                StringBuilder sb = new StringBuilder();
                for (int bit : row) {
                    sb.append(row[0] == 1 ? (bit ^ 1) : bit); 
                }
                return sb.toString();
            })
            .collect(Collectors.groupingBy(rowString -> rowString, Collectors.counting()))
            .values().stream()
            .mapToInt(Long::intValue)
            .max().orElse(0);
    }
}