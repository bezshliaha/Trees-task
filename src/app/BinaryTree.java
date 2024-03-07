package app;

public class BinaryTree {
    Node root;

    public BinaryTree getTree() {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(4);
        tree.root.left = new Node(6);
        tree.root.right = new Node(8);
        tree.root.left.left = new Node(12);
        tree.root.left.right = new Node(28);
        tree.root.right.left = new Node(13);
        tree.root.right.right = new Node(34);
        tree.root.left.left.left = new Node(9);
        tree.root.left.left.right = new Node(7);
        tree.root.right.left.left = new Node(5);
        tree.root.right.left.right = new Node(3);
        tree.root.right.right.right = new Node(1);
        return tree;
    }

    BinaryTree() {
        root = null;
    }

    void inorder(Node node) {
        if (node == null)
            return;
        inorder(node.left);
        System.out.print(node.item + " ");
        inorder(node.right);
    }

    void preorder(Node node) {
        if (node == null)
            return;
        System.out.print(node.item + " ");
        preorder(node.left);
        preorder(node.right);
    }

    void postorder(Node node) {
        if (node == null)
            return;
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.item + " ");
    }
}
