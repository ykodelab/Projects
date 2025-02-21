class Stack {

    int length = 5;
    int stack[] = new int[length];
    int top = 0;

    public void push(int data) {
        if(top == length) {
            System.out.println("Stack is full");
        }
        else {
            stack[top] = data;
            top++;
        }

    }

    public int pop() {
        int data = 0;

        if(isEmpty()) {
            System.out.println("Stack is Emtpy");
        } else {
        top--;
        data = stack[top];
        stack[top] = 0;
        }
        return data;


    }

    public int peak() {

        int data;

        data = stack[top-1];
        return data;


    }

    public int size() {
        return top;
    } 

    public boolean isEmpty() {
        return top <= 0; 
    }

    public void show() {

        for(int n: stack) {
            System.out.print(n + " ");

        }
        System.out.println();
    }

}