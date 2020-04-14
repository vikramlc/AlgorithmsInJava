public class BinaryTree {

    Node root;

    private static boolean isFoldable(Node node) {
        boolean res;
        if(node == null) {
            return true;
        }

        mirror(node.left);
        res = isStructSame(node.left, node.right);
        mirror(node.left);

        return res;
    }

    private static boolean isStructSame(Node a, Node b) {
        if(a == null && b == null) {
            return true;
        } else if(a != null && b != null &&
                isStructSame(a.left, b.left) &&
                isStructSame(a.right, b.right)) {
            return true;
        }
        return false;
    }

    private static void mirror(Node node) {
        if(node == null) {
            return;
        } else {
            Node temp;
            mirror(node.left);
            mirror(node.right);

            temp = node.left;
            node.left = node.right;
            node.right = temp;
        }
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.right.left = new Node(4);
        tree.root.left.right = new Node(5);

        if(isFoldable(tree.root)) {
            System.out.println("TREE IS FOLDABLE!!");
        } else {
            System.out.println("TREE IS NOT FOLDABLE!!");
        }
    }
}