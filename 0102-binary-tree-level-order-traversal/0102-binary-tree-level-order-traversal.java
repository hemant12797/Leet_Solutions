/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> li = new ArrayList<>();
        if(root==null)return li;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        List<Integer> list = new ArrayList<>();
        while(!q.isEmpty()){
            TreeNode currNode = q.remove();
           if(currNode!=null){
                list.add(currNode.val);
                if(currNode.left!=null)q.add(currNode.left);
                if(currNode.right!=null)q.add(currNode.right);
            }else{
                    li.add(new ArrayList<>(list));
                    list.clear();
                    if(!q.isEmpty())q.add(null);
            }
        }return li;
    }
}