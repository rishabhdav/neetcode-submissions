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
    public int goodNodes(TreeNode root) {
       int[] cnt=new int[1];
        SolveIt(root,root.val,cnt);
        return cnt[0];
        
    }
    public static void SolveIt(TreeNode root,int maxValue,int[] cnt){

        if(root==null) return;

        if(root.val>=maxValue){
       cnt[0]=cnt[0]+1;
       maxValue=root.val;

        }
        SolveIt(root.left,maxValue,cnt);
        SolveIt(root.right,maxValue,cnt);

    }
}
