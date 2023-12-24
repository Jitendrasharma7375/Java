class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class BinaryTree {
    Node root;

    BinaryTree() {
        root = null;
    }

    BinaryTree(int data) {
        root = new Node(data);
    }

    private Node insert(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }
        if (data < root.data) {
            root.left = insert(root.left, data);
        } else if (data > root.data) {
            root.right = insert(root.right, data);
        } else {
            return root;
        }
        return root;
    }

    public void add(int data) {
        root = insert(root, data);
    }

    private boolean search(Node root, int data) {
        if (root == null) {
            return false;
        }
        if (root.data == data) {
            return true;
        } else if (root.data < data) {
            return search(root.right, data);
        }
        else {
            return search(root.left, data);
        }
    }
    public boolean search(int data) {
        return search(root, data);
    }
    private void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    private void postorder(Node root) {
        if (root != null) {
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }
    }

    private void preorder(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    public void preorder() {
        preorder(root);
    }

    public void postorder() {
        postorder(root);
    }

    public void inorder() {
        inorder(root);
    }
}

public class BinaryTreeDemo {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.add(50);
        tree.add(30);
        tree.add(20);
        tree.add(40);
        tree.add(70);
        tree.add(60);
        tree.add(80);
        tree.inorder();
        System.out.println();
        tree.preorder();
        System.out.println();
        tree.postorder();
        System.out.println();
        System.out.println(tree.search(80));
    }

}