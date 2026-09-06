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
    public int diameterOfBinaryTree(TreeNode root) 
    {
        if(root==null) return 0;
        int l=find(root.left);
        int r=find(root.right);
        int d=l+r;
        int d1=diameterOfBinaryTree(root.left);
        int d2=diameterOfBinaryTree(root.right);
        return Math.max(d,Math.max(d1,d2));
    }
    public int find(TreeNode root)
    {
        if(root==null) return 0;
        int l=find(root.left);
        int r=find(root.right);
        return 1+Math.max(l,r);
    }
}
