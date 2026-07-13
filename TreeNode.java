public class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;
     public TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
    public static void main(String[] args) {

        // Create nodes
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(15);

        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(7);

        root.right.left = new TreeNode(12);
        root.right.right = new TreeNode(20);
        System.out.println("Root: " + root.val);
        System.out.println("Left Child: " + root.left.val);
        System.out.println("Right Child: " + root.right.val);
        System.out.println("Left Left Child: " + root.left.left.val);
        System.out.println("Left Right Child: " + root.left.right.val);
        System.out.println("Right Left Child: " + root.right.left.val);
        System.out.println("Right Right Child: " + root.right.right.val);
    }
}