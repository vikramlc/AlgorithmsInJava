public class TreeTraversals {

    Node root;

    public static void main(String[] args) {
        TreeTraversals tree = new TreeTraversals();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(2);
        tree.root.left.left = new Node(3);
        tree.root.left.right = new Node(4);
        tree.root.right.left = new Node(4);
        tree.root.right.right = new Node(3);

    }
}
