package acepta.el.reto;

/**
 *
 * @author Alfred
 */
public class BinaryTreePruning {

    public static void main(String[] args) {
        System.out.println();
    }

    public  TreeNode pruneTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        if (!containt(root)) {
            return null;
        }
        
        root.left = pruneTree(root.left);
        root.right = pruneTree(root.right);
        return  root;
    }

    public boolean containt(TreeNode root) {
        if (root == null) {
            return false;
        }
        if (root.val == 1) {
            return true;
        }
        return containt(root.left) || containt(root.right);
    }

    public class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

}
