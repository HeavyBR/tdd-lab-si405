import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import stack.Stack;

@DisplayName("Stack unit tests")
public class StackTest {

    @Test
    @DisplayName("An empty stack should have a 0 size")
    public void emptyStackSize() {
        Stack s = new Stack();
        Assertions.assertTrue(s.isEmpty());
        Assertions.assertEquals(0, s.size());
    }

    @Test
    @DisplayName("An filled stack has to have their properly size")
    public void filledStackSize() {
        Stack s = new Stack(10);
        Assertions.assertFalse(s.isEmpty());
        Assertions.assertEquals(10, s.size());
    }

    @Test
    @DisplayName("Adding an item to a stack")
    public void addItemToStack(){
        Stack s = new Stack<String>();
        s.push("First item");
        Assertions.assertFalse(s.isEmpty());
        Assertions.assertEquals(1, s.size());
    }

    @Test
    @DisplayName("Pop an item from a stack")
    public void popItemFromStack(){
        Stack s = new Stack<String>();
        var firstItem = "First item";
        s.push(firstItem);
        var item = s.pop();
        Assertions.assertTrue(s.isEmpty());
        Assertions.assertEquals(item, firstItem);
    }

    @Test
    @DisplayName("Peek an item from the stack")
    public void peekItemFromStack() {
        Stack s = new Stack<String>();
        var firstItem = "First item";
        s.push(firstItem);
        var item = s.peek();
        Assertions.assertFalse(s.isEmpty());
        Assertions.assertEquals(item, firstItem);
    }

}
