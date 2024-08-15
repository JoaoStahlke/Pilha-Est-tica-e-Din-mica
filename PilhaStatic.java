public class PilhaStatic<T> {
    private int top = -1;
    private T[] data;

    public PilhaStatic(int size) {
        data = (T[]) new Object[size];
    }

    public void push(T value) {
        if (!isFull()) {
            data[++top] = value;
        }
    }

    public T pop() {
        if (!isEmpty()) {
            return data[top--];
        }
        return null; // Retorna null se vazia
    }

    public T peek() {
        if (!isEmpty()) {
            return data[top];
        }
        return null; // Retorna null se vazia
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == data.length - 1;
    }

    public int size() {
        return top + 1;
    }
}
