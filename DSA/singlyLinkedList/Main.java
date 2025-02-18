public class Main {
    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        list.insert(4);
        list.insert(44);
        list.insertAtStart(22);

        list.show();

        list.insertAt(0,111);
        list.show();

        list.deleteAt(2);
        list.show();

        }
    }
