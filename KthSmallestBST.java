public class KthSmallestBST {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    private int count = 0;
    private int result = -1;

    public int kthSmallest(TreeNode root, int k) {
        inorder(root, k);
        return result;
    }

    private void inorder(TreeNode node, int k) {

        if (node == null) {
            return;
        }

        inorder(node.left, k);
        count++;
        if (count == k) {
            result = node.val;
            return;
        }

        if (count < k) {
            inorder(node.right, k);
        }
    }

    // Main method
    public static void main(String[] args) {

        KthSmallestBST obj = new KthSmallestBST();

        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.left.left.left = new TreeNode(1);

        int k = 3;

        System.out.println("The " + k + "rd smallest element is: " + obj.kthSmallest(root, k));
    }
}