import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import stack.Stack;

import java.util.EmptyStackException;

@DisplayName("Stack unit tests")
public class StackTest {

    private Stack s;

    @BeforeEach
    public void init() {
        s = new Stack();
    }

    @Test
    @DisplayName("An empty stack should have a 0 size")
    public void emptyStackSize() {
        assertTrue(s.isEmpty());
        assertEquals(0, s.size());
    }

    @Test
    @DisplayName("An filled stack has to have their properly size")
    public void filledStackSize() {
        s = new Stack(10);
        assertFalse(s.isEmpty());
        assertEquals(10, s.size());
    }

    @Test
    @DisplayName("Adding an item to a stack")
    public void addItemToStack() {
        s.push("First item");
        assertFalse(s.isEmpty());
        assertEquals(1, s.size());
    }

    @Test
    @DisplayName("Pop an item from a stack")
    public void popItemFromStack() {
        var firstItem = "First item";
        s.push(firstItem);
        var item = s.pop();
        assertTrue(s.isEmpty());
        assertEquals(item, firstItem);
    }

    @Test
    @DisplayName("Peek an item from the stack")
    public void peekItemFromStack() {
        var firstItem = "First item";
        s.push(firstItem);
        var item = s.peek();
        assertFalse(s.isEmpty());
        assertEquals(item, firstItem);
    }

    @Test
    @DisplayName("Pop an empty stack")
    public void popEmptyStack() {
        assertThrows(EmptyStackException.class, () -> s.pop());
    }

    @Test
    @DisplayName("Peek an empty stack")
    public void peekEmptyStack() {
        assertThrows(EmptyStackException.class, () -> s.peek());
    }
}
