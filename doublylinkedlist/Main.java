public class Main {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();


        list.prependNode(30);
        list.prependNode(20);
        list.prependNode(10);
        list.prependNode(5);

        System.out.println("Doubly Linked List after prepending nodes: " + list);

        list.removeNodeByValue(20);
        System.out.println("Doubly Linked List after removing node with value 20: " + list);


        list.removeNodeByValue(100);
        System.out.println("Doubly Linked List after trying to remove node with value 100: " + list);

        list.removeNodeByValue(5);
        System.out.println("Doubly Linked List after removing head node with value 5: " + list);


        list.removeNodeByValue(30);
        System.out.println("Doubly Linked List after removing tail node with value 30: " + list);
    }
}
