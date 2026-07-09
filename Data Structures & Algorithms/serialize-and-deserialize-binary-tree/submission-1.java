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

public class Codec {
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if (root == null) return "";

        Queue<TreeNode> q = new LinkedList<>();
        StringBuilder str = new StringBuilder();

        q.add(root);

        while (!q.isEmpty()) {

            TreeNode parent = q.poll();

            if (parent != null) {
                str.append(parent.val).append(",");
                q.add(parent.left);
                q.add(parent.right);
            } else {
                str.append("#,");
            }
        }

        return str.toString();
    }

    // Decodes your encoded val to tree.
    public TreeNode deserialize(String data) {
        if(data.isEmpty()) return null;
        int idx = 0;
        String[] str=data.split(",");
        Queue<TreeNode> q = new LinkedList<>();
        TreeNode root = new TreeNode(Integer.parseInt(str[idx]));

        q.add(root);
        idx++;
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                TreeNode parent = q.poll();
                if (!str[idx].equals("#")) {
                    parent.left = new TreeNode(Integer.parseInt(str[idx]));
                    q.add(parent.left);
                    idx++;
                } else
                    idx++;

                if (!str[idx].equals("#")) {
                    parent.right = new TreeNode(Integer.parseInt(str[idx]));
                    q.add(parent.right);
                    idx++;
                } else
                    idx++;
            }
        }
        return root;
    }
}
