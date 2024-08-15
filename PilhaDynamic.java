public class PilhaDynamic<T> {
    private class Node {
        T data;
        Node next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node top = null;

    public void push(T value) {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
    }

    public T pop() {
        if (!isEmpty()) {
            T value = top.data;
            top = top.next;
            return value;
        }
        return null; // Retorna null vazia
    }

    public T peek() {
        if (!isEmpty()) {
            return top.data;
        }
        return null; // Retorna null se vazia
    }

    public boolean isEmpty() {
        return top == null;
    }
}
