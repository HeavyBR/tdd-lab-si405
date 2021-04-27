package stack;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class Stack<T> {
    private int size;
    private final List<T> items;

    /**
     * Build a new Stack with a fixed initial size
     *
     * @param size will describe the initial size of the Stack
     */
    public Stack(int size) {
        this.size = size;
        items = new ArrayList<T>(this.size);
    }

    /**
     * Construct a new empty stack with 0 initial size
     */
    public Stack() {
        this.size = 0;
        items = new ArrayList<T>(this.size);
    }

    /**
     * @return if the stack is currently empty
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * @return the current size of the stack
     */
    public int size() {
        return size;
    }

    /**
     * @param item will be added to the top of the stack
     */
    public void push(T item) {
        items.add(item);
        size += 1;
    }

    /**
     * @return pop will return the top of the stack and remove him from it
     */
    public T pop() throws EmptyStackException {
        if (size == 0) throw new EmptyStackException();
        var item = items.get(size - 1);
        items.remove(size - 1);
        size -= 1;
        return item;
    }

    /**
     * @return peek will return the top of the stack without remove him from it
     */
    public T peek() throws EmptyStackException {
        if (size == 0) throw new EmptyStackException();
        return items.get(size - 1);
    }
}
