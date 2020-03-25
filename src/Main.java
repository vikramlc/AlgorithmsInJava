public class Main {

    public static void main(String[] args) {
        LinkedList<Integer> n = new LinkedList<>();
        n.addNode(4);
        n.addNode(1);
        n.addNode(9);
        n.addNode(3);
        n.addNode(10);
        System.out.println("BEFORE");
        n.printNodes();
        System.out.println("Number of nodes: " + n.countNodes());
        System.out.println("AFTER");
        n.insertNodeAtNthPosition(5, 20);
        n.printNodes();
        System.out.println("Elements after popping: ");
        n.popElement();
        n.printNodes();
    }
}
