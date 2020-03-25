import java.util.ArrayList;
import java.util.List;

public class LinkedList<T extends Comparable<T>> implements Cloneable {
    private Node<T> head = null;

    public LinkedList() {

    }

    public void display() {
        System.out.println("Linked list test - DISPLAY");
    }

    public void addNode(T data) {
        if(head == null) {
            head = new Node<T>(data);
        } else {
            Node<T> cur = head;
            while(cur.getNext() != null) {
                cur = cur.getNext();
            }
            cur.setNext(new Node<T>(data));
        }
    }

    public void printNodes() {
        if(head == null) {
            System.out.println("Empty LinkedList!");
        } else {
            System.out.println("Elements: ");
            Node<T> cur = head;
            while(cur != null) {
                System.out.println(cur.getData());
                cur = cur.getNext();
            }
        }
    }

    public int countNodes() {
        if(head == null) {
            return 0;
        } else {
            int count = 0;
            Node<T> cur = head;
            while(cur != null) {
                cur = cur.getNext();
                count++;
            }

            return count;
        }
    }

    public void insertNodeAtNthPosition(int n, T data) {
        if(n > countNodes()) {
            return;
        } else if(n == 0) {
            Node<T> cur = head;
            head = new Node<>(data);
            head.setNext(cur);
        } else {
            int i = 0;
            Node<T> next = new Node<>(data);
            Node<T> cur = head;
            while(i < n-2) {
                cur = cur.getNext();
                i++;
            }
            Node<T> nextElement = cur.getNext();
            cur.setNext(next);
            next.setNext(nextElement);
        }
    }

    public Node<T> popElement() {
        if(head != null) {
            Node<T> cur = head;
            head = head.getNext();
            return cur;
        }

        return null;
    }

    public void deleteLinkedList() {
        head = null;
    }

    public void insertSorted(T data) {
        if(head == null || head.getData().compareTo(data) > 0) {
            Node<T> cur = head;
            head = new Node<>(data);
            head.setNext(cur);
        } else {
            Node<T> cur = head;
            while(cur.getNext() != null && cur.getNext().getData().compareTo(data) < 0) {
                cur = cur.getNext();
            }
            Node<T> next = cur.getNext();
            cur.setNext(new Node<>(data));
            cur.getNext().setNext(next);
        }
    }

    public void appendList(LinkedList<T> ll) {
        if(ll.head == null) {
            return;
        }
        Node<T> cur = ll.head;
        while(cur != null) {
            addNode((T) cur.getData());
            cur = cur.getNext();
        }
    }

    public List<Node<T>> frontBackSplit() {
        Node<T> front = null;
        Node<T> back = null;

        if(head == null) {
            front = null;
            back = null;
        } else if(head.getNext() == null) {
            front = head;
            back = null;
        } else {
            Node<T> fast = head;
            Node<T> slow = head;

            while(fast != null) {
                fast = fast.getNext();
                if(fast == null) {
                    break;
                }
                fast = fast.getNext();
                if(fast != null) {
                    slow = slow.getNext();
                }
            }
            front = head;
            back = slow.getNext();
            slow.setNext(null);
        }

        List<Node<T>> list = new ArrayList<>();
        list.add(front);
        list.add(back);
        return list;
    }

    public void removeDuplicates() {
        int count = countNodes();
        if(count == 0 || count == 1) {
            return;
        }

        Node<T> cur = head;
        do{
            if(cur.getNext().getData().compareTo(cur.getData()) == 0) {
                cur.setNext(cur.getNext().getNext());
            } else {
                cur = cur.getNext();            }
        } while(cur.getNext() != null);
    }

    public void changeHead(LinkedList<T> destinationList) {
        Node<T> currHead = popElement();
        if (destinationList.head == null) {
            // If this is the first element in the destination list , simply
            // add it to the list.
            destinationList.addNode(currHead.getData());
        } else {
            Node<T> next = destinationList.head;
            destinationList.head = new Node<T>(currHead.getData());
            destinationList.head.setNext(next);
        }
    }

    public LinkedList<T> sortedMergeList(LinkedList otherList) {
        if (otherList == null) {
            return this;
        } else if (head == null) {
            return otherList;
        } else {
            Node<T> curr1 = otherList.head;
            Node<T> curr2 = head;
            LinkedList<T> sortedList = new LinkedList<T>();

            while (curr1 != null || curr2 != null) {
                if (curr2 == null ||
                        (curr1 != null && curr1.getData().compareTo(curr2.getData()) < 0)) {
                    sortedList.addNode(curr1.getData());
                    curr1 = curr1.getNext();
                }
                else {
                    sortedList.addNode(curr2.getData());
                    curr2 = curr2.getNext();
                }
            }

            return  sortedList;
        }
    }

    public void reverseList() {
        if(head == null || head.getNext() == null) {
            return;
        }

        Node<T> prev = null;
        Node<T> cur = head;
        while(cur != null) {
            Node<T> next = cur.getNext();
            cur.setNext(prev);
            prev = cur;
            cur = next;
        }
    }

}
