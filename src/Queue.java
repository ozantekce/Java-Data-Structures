public class Queue <E> implements IQueue<E> {

    private Node<E> last;
    private Node<E> first;
    private int size=0;

    public void enqueue(E e){

        if(size==0){
            last = new Node<E>(e);
            first = last;
            size++;
            return;
        }

        Node<E> temp = new Node<E>(e);
        last.prev = temp;
        last = temp;
        size++;
    }

    public E dequeue(){
        if(size==0)throw new RuntimeException("Queue is empty");
        E e = first.data;
        first = first.prev;
        size--;
        return e;
    }

    public E peek(){if(isEmpty())return null; else return first.data;}

    public int size(){return size;}
    public boolean isEmpty(){return size==0;}

    private static class Node<E>{
        private Node<E> prev;
        private final E data;

        public Node(E data) {
            this.data = data;
        }

    }



}
