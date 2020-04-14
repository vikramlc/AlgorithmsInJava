public class Solution {

    static class Node {
        int data;
        Node left, right;
    }

    static Node newNode(int data) {
        Node node = new Node();
        node.data = data;
        node.left = node.right = null;
        return node;
    }

    private static boolean treeContinuous(Node root) {
        if(root == null) {
            return true;
        }

        if(root.left == null && root.right == null) {
            return true;
        }

        if(root.left == null) {
            return (Math.abs(root.data - root.right.data) == 1) &&
                    treeContinuous(root.right);
        }

        if(root.right == null) {
            return (Math.abs(root.data - root.left.data) == 1) &&
                    treeContinuous(root.left);
        }

        return (Math.abs(root.data - root.left.data) == 1 &&
                Math.abs(root.data - root.right.data) == 1 &&
                treeContinuous(root.left) && treeContinuous(root.right));
    }

    public static void main(String[] args) {
        Node root = newNode(3);
        root.left = newNode(2);
        root.right = newNode(4);
        root.left.left = newNode(1);
        root.left.right = newNode(3);
        root.right.right = newNode(5);
        if(treeContinuous(root)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

}
