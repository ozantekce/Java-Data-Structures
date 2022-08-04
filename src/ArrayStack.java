public class ArrayStack<E> {

    private final int CAPACITY;
    private E [] data;
    private int topIndex=-1;

    public ArrayStack(int capacity){
        this.CAPACITY = capacity;
        data = (E[])new Object[CAPACITY];

    }

    public int size() {
        return (topIndex + 1);
    }

    public boolean isEmpty() {
        return (topIndex == -1);
    }

    public void push(E e){
        if (size() == data.length){
            return;
        }
        data[++topIndex] = e;
    }

    public E top() {
        if (isEmpty()) return null;
        return data[topIndex];
    }

    public E pop() {
        if (isEmpty()){
            return null;
        }
        E temp = data[topIndex];
        data[topIndex] = null;
        topIndex--;
        return temp;
    }



}
