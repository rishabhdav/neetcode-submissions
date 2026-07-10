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
    public TreeNode buildTree(int[] preorder, int[] inorder) {

 Map<Integer ,Integer>map=new HashMap<>();
 for(int i=0;i<inorder.length;i++){
    map.put(inorder[i],i);
 }
return SolveIt(0,preorder.length-1,preorder,0,inorder.length-1,inorder,map);

}

public  TreeNode SolveIt(int ps,int pe,int[] preorder,int is,int ie,int [] inorder,Map<Integer,Integer>map){
if(ps>pe||is>ie) return null;

int parent=map.get(preorder[ps]);
TreeNode root=new TreeNode(preorder[ps]);
int cal=parent-is;
root.left=SolveIt(ps+1,ps+cal,preorder,is,parent-1,inorder,map);
root.right=SolveIt(ps+cal+1,pe,preorder,parent+1,ie,inorder,map);
return root;


    }
}
