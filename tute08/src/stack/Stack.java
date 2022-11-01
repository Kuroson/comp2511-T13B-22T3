package stack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * A Simple Stack.
 * @param <E> type of stack
 *
 */
public class Stack<E> implements Iterable<E> {
    private List<E> data = new ArrayList<>();

    /**
     * Pushes an element onto the top of the stack.
     * @param element
     */
    public void push(E element) {
        this.data.add(element);
    }

    /**
     * Removes the top element of the stack, and returns that element.
     * @precondition The stack is not empty.
     */
    public E pop() {
        return this.data.remove(this.data.size() - 1);
    }

    /**
     * Returns the top element of the stack, without removing it.
     */
    public E peek() {
        return this.data.get(this.data.size() - 1);
    }

    /**
     * Returns an iterator to the internal data structure of the stack.
     */
    public Iterator<E> iterator() {
        // Array where the first element is the top of the stacl
        List<E> copy = this.toArrayList();
        return copy.iterator();
    }

    /**
     * Returns the size of the stack.
     */
    public int size() {
        return this.data.size();
    }

    /**
     * Returns the stack as an ArrayList
     */
    public ArrayList<E> toArrayList() {
        ArrayList<E> copy = new ArrayList<>(this.data);
        Collections.reverse(copy);
        return copy;
    }

    public static Integer sumStack(Stack<? extends Integer> stack) {
        int counter = 0;

        for (Integer x : stack) {
            counter += x;
        }

        return counter;
    }

    public static void prettyPrint(Stack<?> stack) {
        Iterator<?> itr = stack.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        for (Object x : stack) {
            System.out.println(x);
        }

    }

    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        stack.push("hello");
        stack.push("how");
        stack.push("are");
        stack.push("you");
        stack.push("today");
        prettyPrint(stack);
    }
}