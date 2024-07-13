import java.util.ArrayList;
import java.util.List;

public class DoublyLinkedList {
    private Node head;
    private Node tail;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void prependNode(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.setNext(head);
            head.setPrev(newNode);
            head = newNode;
        }
    }


    @Override
    public String toString() {
        List<Integer> arr = new ArrayList<>();
        Node temp = head;

        while (temp != null) {
            arr.add(temp.getValue());
            temp = temp.getNext();
        }

        return arr.toString();
    }

     public void removeNodeByValue(int value) {
        if (head == null) {
            return;
        }


        if (head.getValue() == value) {
            if (head == tail) {
                head = null;
                tail = null;
            } else {
                head = head.getNext();
                head.setPrev(null);
            }
            return;
        }

        Node current = head.getNext();

        while (current != null) {
            if (current.getValue() == value) {
                if (current == tail) {
                    tail = tail.getPrev();
                    tail.setNext(null);
                } else {

                    Node previous = current.getPrev();
                    Node next = current.getNext();
                    previous.setNext(next);
                    next.setPrev(previous);
                }
                return;
            }
            current = current.getNext();
        }


    }
}
