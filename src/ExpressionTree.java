public class ExpressionTree {

    private static int evaluateExpressionTree(Node root) {
        if(root == null) {
            return 0;
        }

        if(root.left == null && root.right == null) {
            return Integer.valueOf(root.data);
        }

        int left_sum = evaluateExpressionTree(root.left);
        int right_sum = evaluateExpressionTree(root.right);

        if(root.data.equals("+")) {
            return left_sum + right_sum;
        } else if(root.data.equals("-")) {
            return left_sum - right_sum;
        } else if(root.data.equals("*")) {
            return left_sum * right_sum;
        } else {
            return left_sum / right_sum;
        }
    }

    public static void main(String[] args) {
        Node root = new Node("+");
        root.left = new Node("*");
        root.left.left = new Node("5");
        root.left.right = new Node("4");
        root.right = new Node("-");
        root.right.left = new Node("100");
        root.right.right = new Node("20");

        System.out.println("Evaluate: " + evaluateExpressionTree(root));
    }
}
