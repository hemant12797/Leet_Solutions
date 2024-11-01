class Solution {
    int[] left;
    int[] right;
    int[] remove;
    public int[] treeQueries(TreeNode root, int[] queries) {
        left = new int[100001];
        right = new int[100001];
        remove = new int[100001];
        storeMaxDepth(root, 0);
        depthAfterRemove(root, 0);
        for (int i = 0; i < queries.length; i++) {
            queries[i] = remove[queries[i]];
        }
        return queries;
    }
    private int storeMaxDepth(TreeNode root, int level) {
        if (root == null) return level - 1;
        int leftVal = storeMaxDepth(root.left, level + 1);
        int rightVal = storeMaxDepth(root.right, level + 1);
        left[root.val] = leftVal;
        right[root.val] = rightVal;
        return Math.max(leftVal, rightVal);
    }
    private void depthAfterRemove(TreeNode root, int level) {
        if (root == null) return;
        remove[root.val] = level;
        depthAfterRemove(root.left, Math.max(right[root.val], level));
        depthAfterRemove(root.right, Math.max(left[root.val], level));
    }
}