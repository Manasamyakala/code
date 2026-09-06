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
    public List<List<Integer>> levelOrder(TreeNode root) 
    {
        List<List<Integer>> ls=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        if(root==null) return ls;
        q.add(root);
        while(!q.isEmpty())
        {
            int s=q.size();
            List<Integer> r=new ArrayList<>();
            for(int i=0;i<s;i++)
            {
               TreeNode cur=q.poll();
               r.add(cur.val);
               if(cur.left!=null)
               q.add(cur.left);
               if(cur.right!=null)
               q.add(cur.right);
            }
            ls.add(r);
        }
        return ls;
        
    }
}
