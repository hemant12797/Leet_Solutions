class Solution {
    public int slidingPuzzle(int[][] board) {
        int m = board.length;
        int n = board[0].length;
        String target = "123450";
        StringBuilder sb = new StringBuilder();
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                sb.append(board[i][j]);
            }
        }
        
        int[][] moves = {{1,3},{0,2,4},{1,5},{0,4},{1,3,5},{2,4}};
        HashSet<String> set = new HashSet<>();
        Queue<String> q = new LinkedList<>();
        int level = 0;
        
        q.add(sb.toString());
        set.add(sb.toString());
        
        while(!q.isEmpty()){
            int size = q.size();
            while(size-->0){
                String cur = q.poll();
                if(cur.equals(target)){
                    System.out.println(cur);
                    return level;
                }  
                
                int indexOf0 = cur.indexOf('0');
                int[] move = moves[indexOf0];
                    for(int i=0;i<move.length;i++){
                        String swappedStr = swapString(cur, indexOf0, move[i]);
                        if(set.contains(swappedStr))    continue;
                        
                        q.add(swappedStr);
                        set.add(swappedStr);
                    }
                
            }
            level++;
        }
        return -1;
    }
    public String swapString(String cur, int i, int j){
        StringBuilder sb = new StringBuilder(cur);
        sb.setCharAt(i, cur.charAt(j));
        sb.setCharAt(j, cur.charAt(i));
        
        return sb.toString();
    }
}