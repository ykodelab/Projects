public class Main {

    public static void main(String[] args) {

        Queue myQueue = new Queue();
        myQueue.enQueue(1);
        myQueue.enQueue(2);
        myQueue.enQueue(3);
        myQueue.show();
        myQueue.deQueue();
        myQueue.show();
        myQueue.enQueue(4);
        myQueue.enQueue(6);
        myQueue.enQueue(10);
        myQueue.show();
        System.out.println("size: " + myQueue.getSize());
        System.out.println("full: " + myQueue.isFull());


        
    }
    
}
