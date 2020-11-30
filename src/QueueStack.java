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


    public QueueStack() {
        firstStack = new Stack();
        secondStack = new Stack();
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



}
