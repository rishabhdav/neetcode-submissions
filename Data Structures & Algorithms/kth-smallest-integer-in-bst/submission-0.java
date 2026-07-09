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
    public int kthSmallest(TreeNode root, int k) {
        int[] ans=new int[1];
        int[] val=new int[1];
        val[0]=k;
        SolveIt(root,val,ans);
        return  ans[0];
        
        
    }

    public static void  SolveIt(TreeNode root,int[] k,int[] ans){

        if(root==null) return ;
        if(k[0]==0) return;
        SolveIt(root.left,k,ans);
          if(ans[0]<root.val&&k[0]!=0){
           ans[0]=root.val;
           k[0]-=1;

          }
          SolveIt(root.right,k,ans);
         


    }
}
