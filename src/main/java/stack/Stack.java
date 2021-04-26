package stack;

import java.util.ArrayList;
import java.util.List;

public class Stack<T> {
    private int size;
    private List<T> items;

    public Stack(int size) {
        this.size = size;
        items = new ArrayList<T>(this.size);
    }

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
    public T pop() {
        var item = items.get(size - 1);
        items.remove(size - 1);
        size -= 1;
        return item;
    }

    /**
     * @return peek will return the top of the stack without remove him from it
     */
    public T peek() {
        return items.get(size - 1);
    }
}
