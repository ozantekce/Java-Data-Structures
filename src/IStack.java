public interface IStack<E> {

    void push(E e);
    E top();
    E pop();
    int size();
    boolean isEmpty();

}
