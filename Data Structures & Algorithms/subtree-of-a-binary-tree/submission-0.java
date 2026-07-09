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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
             if(root==null) return false;
            if(root.val==subRoot.val) {
                if(SolveIt(root,subRoot)==true) return true;
            }

            boolean left=isSubtree(root.left,subRoot);
            boolean right=isSubtree(root.right,subRoot);

            return left||right;
    }

public static boolean SolveIt(TreeNode root,TreeNode subRoot){

 if(root==null&&subRoot==null) return true;
 if(root==null&&subRoot!=null) return false;
 if(root!=null&&subRoot==null) return false;
 if(root.val!=subRoot.val) return false;

boolean left=SolveIt(root.left,subRoot.left);
boolean right=SolveIt(root.right,subRoot.right);
return left&&right;

    }
}
