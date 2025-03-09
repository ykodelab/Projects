public class Queue {

    int length = 4;
    int[] queue = new int[length];
    int size;
    int front;
    int rear;



    public void enQueue(int data) {

        if(!isFull()){
        queue[rear] = data;
        rear = (rear + 1) % length;
        size++;
        }
        else {
            System.out.println("Queue is Full");
        }

    }

    public void show() {

        System.out.print("Elements: ");
        for(int i = 0; i < size; i++)
        {
            System.out.print(queue[(front + i) % length] + " ");

        }
    }

    public int deQueue() {
        // Just changes the arrows!
        // Can get indexOutOfBounds exception

        int data = queue[front];
        if(!isEmpty()) {
         front = (front + 1) % length;
         size--;
        }
        else {
            System.out.println("Queue is Empty");
        }
         return data;
    
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return getSize() == 0;
    }

    public boolean isFull() {
        return getSize() == length;
    }

}