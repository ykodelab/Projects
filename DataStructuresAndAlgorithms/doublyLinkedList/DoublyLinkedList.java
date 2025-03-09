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

    public void deleteAt(int index) {

        if(index == 0 ) {
            head = head.next;
            head.prev = null;
        }

        else {
            Node n = head;
            for (int i = 0; i < index -1; i++) {
                n = n.next;
            }
            Node temp_n = n.next;
            n.next = temp_n.next;
            n.next.prev = n;
            n.next.next = null;

        }



    }

    public void insertAt(int index, int data) {
        Node node = new Node();
        node.data = data;

        if (index == 0) {
            insertAtStart(node.data);
        } else {
            Node n = head;
            for(int i =0; i <index-1; i++) {
                n = n.next;
            }
            node.next = n.next;
            n.next.prev = node;
            n.next = node;
            node.prev = n;
            
        }

    }
    

    }







