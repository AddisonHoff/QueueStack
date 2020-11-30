/*
Dhruv Sharma
11/30/2020
11/30/2020
This is a the class that defines a queue using stacks.
 */

public class QueueStack<T> {


    private int length;
    private Stack firstStack;
    private Stack secondStack;


    public QueueStack(Stack oneStack, Stack twoStack) {
        firstStack = oneStack;
        secondStack = twoStack;
    }

    public void arrangeStack() { //enters firstStack into secondStack backwards to make it easier to manage

    }


    public boolean isEmpty() { //checks if stack is empty

    }


    public void enqueue(T element) { //add an element

    }

    public T dequeue() { //remove and return the first element

    }

    public int size() {
        return secondStack.size();
    }

    public T peek() { //look at the top element without removing

    }

}
