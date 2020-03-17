public class BinarySearchTree {

    Node root;

    public BinarySearchTree() {
        root = null;
    }

    public boolean search(int key) {
        return search(root, key);
    }

    private boolean search(Node root, int key) {
        if(root == null) {
            return false;
        } else if(root.key == key) {
            return true;
        } else if(root.left != null && key < root.key) {
            return search(root.left, key);
        } else if (root.right != null && key > root.key) {
            return search(root.right, key);
        }

        return false;
    }

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.root = new Node(6);
        tree.root.left = new Node(4);
        tree.root.right = new Node(8);
        tree.root.left.left = new Node(1);
        tree.root.left.right = new Node(5);

        if(tree.search(8)) {
            System.out.println("Key found!!");
        }


    }
}
