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
    public boolean isBalanced(TreeNode root) {
        
boolean[] ans=new boolean[1];
SolveIt(root,ans);

        return !ans[0];
    }
    public static int SolveIt(TreeNode root,boolean[] ans){

        if(root==null) return 0;

        int left=SolveIt(root.left,ans);
        int right=SolveIt(root.right,ans);

     if(Math.abs(left-right)>1) ans[0]=true;

     return Math.max(left,right)+1;
    }
}
