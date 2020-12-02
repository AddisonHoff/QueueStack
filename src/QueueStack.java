/*
Dhruv Sharma
11/30/2020
11/30/2020
This is a the class that defines a queue using stacks.
 */

public class QueueStack<T> {


    private Stack firstStack;
    private Stack secondStack;


    public QueueStack() {
        firstStack = new Stack();
        secondStack = new Stack();
    }



    public boolean isEmpty() { //checks if stack is empty
        return firstStack.isEmpty() && secondStack.isEmpty();
    }


    public void enqueue(T element) { //add an element

        while(secondStack.size() > 0) {
            firstStack.push(secondStack.pop());
        }

        firstStack.push(element);

        while(firstStack.size() > 0){
            secondStack.push(firstStack.pop());
        }

    }

    public T dequeue() { //remove and return the first element
        return (T)secondStack.pop();
    }

    public int size() {
        return firstStack.size() + secondStack.size();
        
    }

    public T peek() { //look at the top element without removing
        return secondStack.peek();
    }

}
