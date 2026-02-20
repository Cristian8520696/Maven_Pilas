package umg.edu.gt.data_structure.stack.manual;

public class StackLinked {

    private Node top;
    private int count;

    public StackLinked() {
        this.top = null;
        this.count = 0;
    }

    public void push(char value) {
        top = new Node(value, top);
        count++;
    }

    public char pop() {
        if (isEmpty()) {
            throw new RuntimeException("La pila está vacía");
        }

        char temp = top.value;
        top = top.next;
        count--;
        return temp;
    }

    public char peek() {
        if (isEmpty()) {
            throw new RuntimeException("La pila está vacía");
        }

        return top.value;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int getCount() {
        return count;
    }

    public Node getNodeInit() {
        return top;
    }
}