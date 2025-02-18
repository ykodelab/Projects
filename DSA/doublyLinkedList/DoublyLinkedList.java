public class DoublyLinkedList {

    Node head; 

    public void insertAtEnd(int data) {
        Node node = new Node();
        node.data = data;

        if (head == null) {
            head = node;
        } else {

            Node n = head;
            while (n.next!= null) {
                n=n.next;
            }
            n.next = node;
            node.prev = n; 
            // Set the prev pointer of 
            //the new node to the last node.

        }

    }

    public void show() {
        Node n = head;
        while(n.next!= null) {
            System.out.println(n.data);
            n= n.next;
        }
        System.out.println(n.data);

    }

    public void insertAtStart(int data) {
        Node node = new Node();
        node.data = data;
        node.prev = null; // Not necessary since initialized w this value
        node.next = head;
        head = node;
    }







}