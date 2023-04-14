public interface IQueue<E>{
    void enqueue(E e);
    E dequeue();
    E peek();
    int size();
    boolean isEmpty();
}
