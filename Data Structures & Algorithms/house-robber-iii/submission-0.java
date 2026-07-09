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

 class Pair{
    int withroot;
    int withoutroot;

    Pair(int x,int y){
        this.withroot=x;
        this.withoutroot=y;
    }
 }
class Solution {
    public int rob(TreeNode root) {
        Pair ans=SolveIt(root);
        return  Math.max(ans.withoutroot,ans.withroot);
    }

public  Pair SolveIt(TreeNode root){

if(root==null) return new Pair(0,0);

Pair left=SolveIt(root.left);
Pair right=SolveIt(root.right);

return new Pair(root.val+left.withoutroot+right.withoutroot,
 Math.max(left.withroot,left.withoutroot)+
 Math.max(right.withoutroot,right.withroot));

    }
}