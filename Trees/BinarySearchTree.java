public class BinarySearchTree {
    static class Node {
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
        }
    }

    static Node insert(Node root, int value) {
        if (root == null) {
            return new Node(value);
        }
        if (value < root.value) {
            root.left = insert(root.left, value);
        } else {
            root.right = insert(root.right, value);
        }
        return root;
    }

    static void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.value + " ");
        inOrder(root.right);
    }

    public static void main(String[] args) {
        Node root = null;
        for (int value : new int[]{50, 30, 70, 20, 40, 60, 80}) {
            root = insert(root, value);
        }
        inOrder(root);
        System.out.println();
    }
}