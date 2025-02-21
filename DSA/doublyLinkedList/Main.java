public class Main {

    // Testing functionality


    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.insertAtEnd(4);
        dll.insertAtEnd(6);
        dll.insertAtStart(2);
        dll.insertAt(2, 124);
        dll.show();
        dll.deleteAt(2);
        dll.show();


    }
}